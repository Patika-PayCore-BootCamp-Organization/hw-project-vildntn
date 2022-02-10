package com.example.Project.service;

import com.example.Project.model.entity.HostelReservation;

import java.util.List;

public interface HostelReservationService {
    List<HostelReservation> getAllHostelReservations();
    void addHostelReservation(HostelReservation hostelReservation);
    boolean deleteHostelReservation(Integer id);
    HostelReservation getHostelReservationById(int id);
    HostelReservation updateHostelReservation(HostelReservation hostelReservation);
}