package com.jrtp.mini2.data.respository;

import com.jrtp.mini2.data.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Long> {
    public ContactEntity findByEmail(String email);
}
