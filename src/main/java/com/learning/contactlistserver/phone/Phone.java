package com.learning.contactlistserver.phone;

import com.learning.contactlistserver.contact.Contact;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int ddd;

    private int number;

    @ManyToOne()
    @JoinColumn(name = "contact_id")
    private Contact contact;
}
