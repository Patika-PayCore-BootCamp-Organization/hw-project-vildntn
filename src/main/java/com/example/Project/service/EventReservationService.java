package com.example.Project.service;


import com.example.Project.model.entity.EventReservation;


import java.util.List;

public interface EventReservationService {
    List<EventReservation> getAllEventReservations();
    void addEventReservation(EventReservation eventReservation);
    boolean deleteEventReservation(Integer id);
    EventReservation getEventReservationById(int id);
    EventReservation updateEventReservation(EventReservation eventReservation);
}
