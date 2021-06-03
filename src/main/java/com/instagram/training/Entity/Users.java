package com.instagram.training.Entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity(name="Users")
public class Users {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String userId;
    private String userName;
    private String name;
    private String ProfileImage;


    public Users() {
        super();
    }

    public Users(int id, String userId, String userName, String name, String profileImage) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.name = name;
        ProfileImage = profileImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImage() {
        return ProfileImage;
    }

    public void setProfileImage(String profileImage) {
        ProfileImage = profileImage;
    }
}
