package com.jrtp.mini2.data.service;

import com.jrtp.mini2.data.entity.ContactEntity;

import java.util.Map;

public interface ContactService {
    public boolean findByEmail(String email);
    public Map<Long, String> getAllCountries();
    public Map<Long, String> getStates(Long countryId);
    public Map<Long, String> getCities(Long stateId);
}
