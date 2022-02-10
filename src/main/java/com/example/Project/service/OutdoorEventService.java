package com.example.Project.service;


import com.example.Project.model.entity.OutDoorEvent;

import java.util.List;

public interface OutdoorEventService {
    List<OutDoorEvent> getAllOutDoorEvents();
    void addOutDoorEvent(OutDoorEvent outDoorEvent);
    boolean deleteOutDoorEvent(Integer id);
    OutDoorEvent getOutDoorEventById(int id);
    OutDoorEvent updateOutDoorEvent(OutDoorEvent outDoorEvent);
}