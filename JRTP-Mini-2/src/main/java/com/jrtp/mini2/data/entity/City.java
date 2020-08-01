package com.jrtp.mini2.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class City {
    @Id
    private Long cityId;
    private String cityName;
    private Long stateId;

    public Long getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public Long getStateId() {
        return stateId;
    }
}
