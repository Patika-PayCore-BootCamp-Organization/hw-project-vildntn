package com.example.Project.controller;

import com.example.Project.model.entity.HostelReservation;
import com.example.Project.model.entity.OutDoorEvent;
import com.example.Project.service.OutdoorEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/outdoorEvent")
public class OutdoorEventController {
    @Autowired
    private OutdoorEventService outdoorEventService;

    @GetMapping("/getAll")
    public List<OutDoorEvent> getAll() {

        return outdoorEventService.getAllOutDoorEvents();
    }
    @PostMapping("/add")
    public void add(@RequestBody OutDoorEvent outDoorEvent) {

        outdoorEventService.addOutDoorEvent(outDoorEvent);
    }

    @GetMapping(value="/{id}")
    public OutDoorEvent getById(@PathVariable Integer id){
        return outdoorEventService.getOutDoorEventById(id);
    }
}
