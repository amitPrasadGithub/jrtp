package com.vb.mini1.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vb.mini1.data.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
