package com.samuelsilva.workshopmongo.services;

import com.samuelsilva.workshopmongo.domain.User;
import com.samuelsilva.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

}
