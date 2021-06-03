package com.instagram.training.Controler;

import com.instagram.training.Entity.Users;
import com.instagram.training.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserControler {

    @Autowired
    UserService userService;

    @PostMapping("")
    private boolean submitUser(@RequestBody Users users){
        userService.submitMetaDataofUser(users);
        return true;
    }

    @GetMapping("/{userid}")
    private Users getUserDetails(@PathVariable("userid") String userId){

        return userService.displayMetaDataofUser(userId);
    }

    @GetMapping("")
    private Iterable<Users> getAllUserDetails(){

        return userService.displayMetaDataofAllUsers();
    }

}
