package com.example.Project.service.iml;

import com.example.Project.model.entity.OutDoorEvent;
import com.example.Project.repository.OutdoorEventDal;
import com.example.Project.service.OutdoorEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutdoorEventServiceImpl implements OutdoorEventService {

    @Autowired
    private OutdoorEventDal outdoorEventDal;

    @Override
    public List<OutDoorEvent> getAllOutDoorEvents() {
        return outdoorEventDal.findAll();
    }

    @Override
    public void addOutDoorEvent(OutDoorEvent outDoorEvent) {
        outdoorEventDal.save(outDoorEvent);
    }

    @Override
    public boolean deleteOutDoorEvent(Integer id) {
        outdoorEventDal.delete(getOutDoorEventById(id));
        return true;
    }

    @Override
    public OutDoorEvent getOutDoorEventById(int id) {
        return outdoorEventDal.getById(id);
    }

    @Override
    public OutDoorEvent updateOutDoorEvent(OutDoorEvent outDoorEvent) {
        return null;
    }
}