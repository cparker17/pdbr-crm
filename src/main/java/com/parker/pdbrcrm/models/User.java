package com.parker.pdbrcrm.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    @OneToOne
    private Address address;

    private String phone;

    private String email;

    @OneToMany
    private List<Lead> leads;

    public void addLead (Lead lead) {
        if (leads.isEmpty()) {
            leads = new ArrayList<>();
        }
        leads.add(lead);
    }

}
