package com.instagram.training.Repository;

import com.instagram.training.Entity.Status;
import com.instagram.training.Entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface StatusRepo extends CrudRepository<Status,Integer> {

    Status save (Status status);
    Status findByUserId(String statusId);
}
