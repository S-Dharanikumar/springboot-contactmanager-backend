package com.dharani.contactmanager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dharani.contactmanager.entity.Contact;
import com.dharani.contactmanager.service.ContactService;

@RestController
@RequestMapping("/api/contacts")
@CrossOrigin("*")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    // CREATE CONTACT
    @PostMapping
    public Contact createContact(@RequestBody Contact contact) {
        return service.saveContact(contact);
    }

    // GET ALL CONTACTS
    @GetMapping
    public List<Contact> getAllContacts() {
        return service.getAllContacts();
    }

    // GET CONTACT BY ID
    @GetMapping("/{id}")
    public Contact getContactById(@PathVariable Long id) {
        return service.getContactById(id);
    }

    // UPDATE CONTACT
    @PutMapping("/{id}")
    public Contact updateContact(@PathVariable Long id,
                                 @RequestBody Contact contact) {

        return service.updateContact(id, contact);
    }

    // DELETE CONTACT
    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable Long id) {
        service.deleteContact(id);
    }
}.\mvnw.cmd spring-boot:run