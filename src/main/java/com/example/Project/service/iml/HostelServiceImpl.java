package com.example.Project.service.iml;


import com.example.Project.model.entity.Hostel;
import com.example.Project.repository.HostelDal;
import com.example.Project.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostelServiceImpl implements HostelService {

    @Autowired
    private HostelDal hostelDal;

    @Override
    public List<Hostel> getAllHostels() {
        return hostelDal.findAll();
    }

    @Override
    public void addHostel(Hostel hostel) {
        hostelDal.save(hostel);
    }


    @Override
    public boolean deleteHostel(Integer id) {
        hostelDal.delete(getHostelById(id));
        return true;
    }

    @Override
    public Hostel getHostelById(int id) {
        return hostelDal.getById(id);
    }

    @Override
    public Hostel updateHostel(Hostel hostel) {
        return null;
    }
}
