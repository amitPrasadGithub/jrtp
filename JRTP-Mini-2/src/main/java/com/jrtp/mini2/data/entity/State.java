package com.jrtp.mini2.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class State {
    @Id
    private Long stateId;
    private String stateName;
    private Long countryId;

    public Long getStateId() {
        return stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public Long getCountryId() {
        return countryId;
    }
}
