package com.learning.contactlistserver.contact;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactsRepository extends JpaRepository<Contact, Long> {

    List<Contact> findByNameContainingOrCpfContaining(String name, String cpf);
}
