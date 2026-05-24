package com.dharani.contactmanager.service;

import java.util.List;

import com.dharani.contactmanager.entity.Contact;

public interface ContactService {

    Contact saveContact(Contact contact);

    List<Contact> getAllContacts();

    Contact getContactById(Long id);

    Contact updateContact(Long id, Contact contact);

    void deleteContact(Long id);
}package com.dharani.contactmanager.service;

import com.dharani.contactmanager.entity.Contact;
import java.util.List;

public interface ContactService {

    Contact saveContact(Contact contact);

    List<Contact> getAllContacts();

    Contact getContactById(Long id);

    Contact updateContact(Long id, Contact contact);

    void deleteContact(Long id);
}