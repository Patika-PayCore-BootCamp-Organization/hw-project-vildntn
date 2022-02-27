package com.example.Project.model.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "First name cannot be empty")
    @Column(name = "first_name")
    private String firstName;

    @NotNull(message = "Last name cannot be empty")
    @Column(name = "last_name")
    private String lastName;

    @NotNull(message = "Phone number cannot be empty")
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "gender")
    private String gender;

    @Email
    @Column(name = "email")
    private String email;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn( name = "room_id")
    private Room room;

}
