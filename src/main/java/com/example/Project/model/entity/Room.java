package com.example.Project.model.entity;

import com.example.Project.model.entity.Customer;
import com.example.Project.model.entity.Hostel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "room_number")
    private int roomNumber;

    /*@Column(name = "room_number")
    private int roomNumber;*/

    @Column(name = "room_floor")
    private int roomFloor;

    @Column(name = "capacity")
    private int capacity;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "hostel_id")
    private Hostel hostel;

    @OneToMany(mappedBy = "room",cascade = CascadeType.MERGE)
    private List<Customer> customers;
}