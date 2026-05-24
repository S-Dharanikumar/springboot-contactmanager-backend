package com.dharani.contactmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dharani.contactmanager.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}