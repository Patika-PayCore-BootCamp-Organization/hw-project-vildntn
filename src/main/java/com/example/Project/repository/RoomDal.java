package com.example.Project.repository;

import com.example.Project.model.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomDal extends JpaRepository<Room,Integer> {
}
