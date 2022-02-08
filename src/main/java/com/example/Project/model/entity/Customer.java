package com.example.Project.model.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn( name = "room_id")
    private Room room;

}
