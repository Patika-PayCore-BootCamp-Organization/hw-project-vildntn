package com.example.Project.repository;

import com.example.Project.model.entity.OutDoorEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutdoorEventDal extends JpaRepository<OutDoorEvent,Integer> {
}
