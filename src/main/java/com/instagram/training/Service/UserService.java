package com.instagram.training.Service;

import com.instagram.training.Entity.Users;
import com.instagram.training.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;


    public Users submitMetaDataofUser(Users user){

        return userRepo.save(user);
    }

    public Users displayMetaDataofUser(String userid){

        return userRepo.findByUserId(userid);
    }



    public Iterable<Users> displayMetaDataofAllUsers(){

        return userRepo.findAll();
    }
}
