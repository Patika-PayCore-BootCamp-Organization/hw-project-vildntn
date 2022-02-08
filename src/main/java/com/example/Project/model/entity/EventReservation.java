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
@Table(name = "event_reservations")
public class EventReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /*@OneToMany()  bir customerında birden fazla outdoor etkinliği olabilir
    private Customer customer;
*/
    @Column(name = "event_name")
    private String event_name;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private int end_date;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "hostel_id")
    private Hostel hostel;
}
