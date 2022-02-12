package com.example.Project.controller;

import com.example.Project.model.entity.EventReservation;
import com.example.Project.model.entity.Hostel;
import com.example.Project.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hostel")
public class HostelController {
    @Autowired
    private HostelService hostelService;

    @GetMapping("/getAll")
    public List<Hostel> getAll() {

        return hostelService.getAllHostels();
    }
    @PostMapping("/add")
    public void add(@RequestBody Hostel hostel) {

        hostelService.addHostel(hostel);
    }

    @GetMapping(value="/{id}")
    public Hostel getById(@PathVariable Integer id){
        return hostelService.getHostelById(id);
    }
}
