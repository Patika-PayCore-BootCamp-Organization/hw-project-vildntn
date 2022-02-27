package com.example.Project.controller;


import com.example.Project.model.entity.Room;
import com.example.Project.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/room")
public class RoomController {

    private final RoomService roomService;

    @GetMapping("/getAll")
    public List<Room> getAll() {

        return roomService.getAllRooms();
    }
    @PostMapping("/add")
    public void add(@RequestBody Room room) {

        roomService.addRoom(room);
    }

    @GetMapping(value="/{id}")
    public Room getById(@PathVariable Integer id){
        return roomService.getRoomById(id);
    }
}
