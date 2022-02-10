package com.example.Project.service;



import com.example.Project.model.entity.Room;

import java.util.List;

public interface RoomService {
    List<Room> getAllRooms();
    void addRoom(Room room);
    boolean deleteRoom(Integer id);
    Room getRoomById(int id);
    Room updateRoom(Room room);
}