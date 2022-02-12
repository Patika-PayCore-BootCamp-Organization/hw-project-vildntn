package com.example.Project.controller;

import com.example.Project.model.entity.EventReservation;
import com.example.Project.service.EventReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eventReservaions")
public class EventReservationController {
    @Autowired
    private EventReservationService eventReservationService;

    @GetMapping("/getAll")
    public List<EventReservation> getAll() {

        return eventReservationService.getAllEventReservations();
    }
    @PostMapping("/add")
    public void add(@RequestBody EventReservation eventReservation) {

        eventReservationService.addEventReservation(eventReservation);
    }

    @GetMapping(value="/{id}")
    public EventReservation getById(@PathVariable Integer id){
        return eventReservationService.getEventReservationById(id);
    }
}
