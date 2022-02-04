package com.example.Project.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
    @Id
    @Generated()
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_name")
    private String phoneNumber;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email")
    private String email;

}
