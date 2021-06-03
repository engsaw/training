package com.instagram.training.Service;

import com.instagram.training.Entity.Status;
import com.instagram.training.Repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {

    @Autowired
    StatusRepo statusRepo;


    public boolean submitUserStatus(Status status){

        statusRepo.save(status);
    return true;
    }


    public Status getUserStatus(String statusId){

        return statusRepo.findByUserId(statusId);

    }
}
