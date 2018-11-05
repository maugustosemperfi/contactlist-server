package com.learning.contactlistserver.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactsService {

    @Autowired
    ContactsRepository contactsRepository;

    public Contact createContact(Contact contact) {
        return this.contactsRepository.saveAndFlush(contact);
    }

    public Contact getContact(Long id) {
        return this.contactsRepository.findById(id).get();
    }

    public List<Contact> getContacts() {
        return this.contactsRepository.findAll();
    }

    public Contact updateContact(Contact contact) {
        return this.contactsRepository.saveAndFlush(contact);
    }

    public void deleteContact(Long id) {
        this.contactsRepository.deleteById(id);
    }

    public List<Contact> findByNameAndCpf(String name, String cpf) {
        return this.contactsRepository.findByNameContainingOrCpfContaining(name, cpf);
    }

}
