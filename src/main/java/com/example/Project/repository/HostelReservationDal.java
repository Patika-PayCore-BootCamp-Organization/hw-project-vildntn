package com.example.Project.repository;

import com.example.Project.model.entity.Hostel;
import com.example.Project.model.entity.HostelReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostelReservationDal extends JpaRepository<HostelReservation,Integer> {
}
