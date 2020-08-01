package com.jrtp.mini2.data.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Country {
    @Id
    private Long countryId;
    private String countryCode;
    private String countryName;

    public Long getCountryId() {
        return countryId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }
}
