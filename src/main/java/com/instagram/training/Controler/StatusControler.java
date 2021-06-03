package com.instagram.training.Controler;


import com.instagram.training.Entity.Status;
import com.instagram.training.Service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusControler {

    @Autowired
    StatusService statusService;

    @PostMapping("")
    private boolean submitStatus(@RequestBody Status status){

        statusService.submitUserStatus(status);
        return true;
    }

    @GetMapping("/{statusId}")
    private Status getStatus(@PathVariable String statusId){

        return statusService.getUserStatus(statusId);

    }


}
