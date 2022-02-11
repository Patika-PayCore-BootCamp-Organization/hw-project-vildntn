package com.example.Project.service.iml;

import com.example.Project.model.entity.EventReservation;
import com.example.Project.repository.EventReservationDal;
import com.example.Project.service.EventReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventReservationServiceImpl implements EventReservationService {
    @Autowired
    private EventReservationDal eventReservationDal;

    @Override
    public List<EventReservation> getAllEventReservations() {
        return eventReservationDal.findAll();
    }

    @Override
    public void addEventReservation(EventReservation eventReservation) {
        eventReservationDal.save(eventReservation);
    }

    @Override
    public boolean deleteEventReservation(Integer id) {

        eventReservationDal.delete(getEventReservationById(id));
        return true;
    }

    @Override
    public EventReservation getEventReservationById(int id) {
        return eventReservationDal.getById(id);
    }

    @Override
    public EventReservation updateEventReservation(EventReservation eventReservation) {
        return null;
    }
}

