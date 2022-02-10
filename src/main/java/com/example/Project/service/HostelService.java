package com.example.Project.service;

import com.example.Project.model.entity.Customer;
import com.example.Project.model.entity.Hostel;

import java.util.List;

public interface HostelService {
    List<Hostel> getAllHostels();
    void addHostel(Hostel hostel);
    boolean deleteHostel(Integer id);
    Hostel getHostelById(int id);
    Hostel updateHostel(Hostel hostel);
}
