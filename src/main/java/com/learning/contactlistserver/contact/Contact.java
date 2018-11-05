package com.learning.contactlistserver.contact;

import com.learning.contactlistserver.phone.Phone;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String cpf;

    private String email;

    private LocalDate birthday;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "contact",  fetch = FetchType.EAGER)
    private List<Phone> phones;
}
