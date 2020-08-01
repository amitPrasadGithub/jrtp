package com.jrtp.mini2.data.respository;

import com.jrtp.mini2.data.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
