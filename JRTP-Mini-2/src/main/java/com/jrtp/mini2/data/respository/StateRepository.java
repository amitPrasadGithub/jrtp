package com.jrtp.mini2.data.respository;

import com.jrtp.mini2.data.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StateRepository extends JpaRepository<State, Long> {
    public List<State> findByCountryId(Long countryId);
}
