package com.jrtp.mini2.data.respository;

import com.jrtp.mini2.data.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    public List<City> findByStateId(Long stateId);
}
