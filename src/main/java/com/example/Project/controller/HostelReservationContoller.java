package com.example.Project.controller;
import com.example.Project.model.entity.HostelReservation;
import com.example.Project.service.HostelReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/hostelReservation")
public class HostelReservationContoller {

    private final HostelReservationService hostelReservationService;

    @GetMapping("/getAll")
    public List<HostelReservation> getAll() {

        return hostelReservationService.getAllHostelReservations();
    }
    @PostMapping("/add")
    public void add(@RequestBody HostelReservation hostelReservation) {

        hostelReservationService.addHostelReservation(hostelReservation);
    }

    @GetMapping(value="/{id}")
    public HostelReservation getById(@PathVariable Integer id){
        return hostelReservationService.getHostelReservationById(id);
    }
}
