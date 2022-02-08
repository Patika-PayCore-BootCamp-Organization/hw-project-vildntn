package com.example.Project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hostel")
public class Hostel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hostel_name")
    private String hostelName;

    @Column(name = "address")
    private String address;

    @Column(name = "room_numbers")
    private int roomNumbers;

    @OneToMany(mappedBy = "hostel",cascade = CascadeType.MERGE)
    private List<Room> rooms;
}