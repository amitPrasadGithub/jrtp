package com.jrtp.mini2.data.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class ContactEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long contactId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Date dob;
    private String country;
    private String state;
    private String city;
    private String activeSw;
    private String status;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    @Column(updatable = false)
    private Date creationDate;

    @UpdateTimestamp
    @Temporal(TemporalType.DATE)
    @Column(insertable = false)
    private Date updateDate;
}
