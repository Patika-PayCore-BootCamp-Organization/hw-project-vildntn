package com.example.Project.repository;

import com.example.Project.model.entity.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostelDal extends JpaRepository<Hostel,Integer> {
}
