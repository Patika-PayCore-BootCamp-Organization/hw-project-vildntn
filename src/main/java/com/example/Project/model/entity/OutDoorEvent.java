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
@Table(name = "outdoor_events")
public class OutDoorEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "price")
    private String price;

    @OneToOne()
    @JoinColumn(name = "id")
    @MapsId
    private EventReservation eventReservation;

}
