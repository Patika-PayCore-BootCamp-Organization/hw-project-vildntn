package com.example.Project.repository;

import com.example.Project.model.entity.EventReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventReservationDal extends JpaRepository<EventReservation,Integer> {
}
