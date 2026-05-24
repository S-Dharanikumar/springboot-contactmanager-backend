package com.dharani.contactmanager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dharani.contactmanager.entity.Contact;
import com.dharani.contactmanager.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository repository;

    public ContactServiceImpl(ContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public Contact saveContact(Contact contact) {
        return repository.save(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return repository.findAll();
    }

    @Override
    public Contact getContactById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Contact updateContact(Long id, Contact contact) {

        Contact existingContact = repository.findById(id).orElse(null);

        if (existingContact != null) {
            existingContact.setName(contact.getName());
            existingContact.setEmail(contact.getEmail());
            existingContact.setPhone(contact.getPhone());

            return repository.save(existingContact);
        }

        return null;
    }

    @Override
    public void deleteContact(Long id) {
        repository.deleteById(id);
    }
}