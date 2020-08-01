package com.jrtp.mini2.data.service.impl;

import com.jrtp.mini2.data.entity.City;
import com.jrtp.mini2.data.entity.ContactEntity;
import com.jrtp.mini2.data.entity.Country;
import com.jrtp.mini2.data.entity.State;
import com.jrtp.mini2.data.respository.CityRepository;
import com.jrtp.mini2.data.respository.ContactRepository;
import com.jrtp.mini2.data.respository.CountryRepository;
import com.jrtp.mini2.data.respository.StateRepository;
import com.jrtp.mini2.data.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private CityRepository cityRepository;

    @Override
    public boolean findByEmail(String email) {
        ContactEntity contactEntity = contactRepository.findByEmail(email);
        if(contactEntity != null)
            return false;
        return true;
    }

    public Map<Long, String> getAllCountries() {
        List<Country> countryList = countryRepository.findAll();
        Map<Long, String> countryMap = new LinkedHashMap<>();
        countryList.forEach(
                (countryEntity) -> {
                    countryMap.put(countryEntity.getCountryId(), countryEntity.getCountryName());
                }
        );
        return countryMap;
    }

    public Map<Long, String> getStates(Long countryId) {
        List<State> stateList = stateRepository.findByCountryId(countryId);
        Map<Long, String> stateMap = new LinkedHashMap<>();
        stateList.forEach(
                (state) -> {
                    stateMap.put(state.getStateId(), state.getStateName());
                }
        );
        return stateMap;
    }

    public Map<Long, String> getCities(Long stateId) {
        List<City> cityList = cityRepository.findByStateId(stateId);
        Map<Long, String> cityMap = new LinkedHashMap<>();
            cityList.forEach(
                    (city) -> {
                        cityMap.put(city.getCityId(), city.getCityName());
                    }
            );
            return cityMap;
    }
}
