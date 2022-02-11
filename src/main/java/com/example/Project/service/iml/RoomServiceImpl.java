package com.example.Project.service.iml;

import com.example.Project.model.entity.Room;
import com.example.Project.repository.RoomDal;
import com.example.Project.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomDal roomDal;

    @Override
    public List<Room> getAllRooms() {
        return roomDal.findAll();
    }

    @Override
    public void addRoom(Room room) {
        roomDal.save(room);
    }

    @Override
    public boolean deleteRoom(Integer id) {
        roomDal.delete(getRoomById(id));
        return true;
    }

    @Override
    public Room getRoomById(int id) {
        return roomDal.getById(id);
    }

    @Override
    public Room updateRoom(Room room) {
        return null;
    }
}