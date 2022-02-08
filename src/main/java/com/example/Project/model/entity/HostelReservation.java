package com.example.Project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hostel_reservations")
public class HostelReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id", referencedColumnName = "id")
    private Room room;

    @Column(name = "arrival_date")
    private Date arrivalDate;

    @Column(name = "departure_date")
    private Date departureDate;

    @Column(name = "price")
    private int price;
}