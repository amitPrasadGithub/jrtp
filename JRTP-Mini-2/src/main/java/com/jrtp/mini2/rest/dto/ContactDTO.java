package com.jrtp.mini2.rest.dto;

import lombok.Data;

@Data
public class ContactDTO {
    private Long contactId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String country;
    private String state;
    private String city;
    private String activeSw;
    private String status;
}
