package com.learning.contactlistserver.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/contacts")
@CrossOrigin
public class ContactsController {

    @Autowired
    ContactsService contactsService;

    @GetMapping()
    public List<Contact> getAll(@RequestParam("name") String name, @RequestParam("cpf") String cpf) {
        return this.contactsService.findByNameAndCpf(name, cpf);
    }

    @GetMapping("{id}")
    public Contact getContact(@PathVariable(value = "id") Long id) {
        return this.contactsService.getContact(id);
    }

    @PostMapping("create")
    public Contact createContact(@RequestBody Contact contact) {
        return this.contactsService.createContact(contact);
    }

    @PostMapping("{id}/update")
    public Contact updateContact(@PathVariable(value = "id") Long id, @RequestBody Contact contact) {
        return this.contactsService.updateContact(contact);
    }

    @PostMapping("{id}/delete")
    public void deleteContact(@PathVariable(value = "id") Long id) {
        this.contactsService.deleteContact(id);
    }
}
