package com.example.Project.service.iml;

import com.example.Project.model.entity.HostelReservation;
import com.example.Project.repository.HostelReservationDal;
import com.example.Project.service.HostelReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostelReservationServiceImpl implements HostelReservationService {
    @Autowired
    private HostelReservationDal hostelReservationDal;

    @Override
    public List<HostelReservation> getAllHostelReservations() {
        return hostelReservationDal.findAll();
    }

    @Override
    public void addHostelReservation(HostelReservation hostelReservation) {
        hostelReservationDal.save(hostelReservation);
    }

    @Override
    public boolean deleteHostelReservation(Integer id) {
        hostelReservationDal.delete(getHostelReservationById(id));
        return true;
    }

    @Override
    public HostelReservation getHostelReservationById(int id) {
        return hostelReservationDal.getById(id);
    }

    @Override
    public HostelReservation updateHostelReservation(HostelReservation hostelReservation) {
        return null;
    }
}