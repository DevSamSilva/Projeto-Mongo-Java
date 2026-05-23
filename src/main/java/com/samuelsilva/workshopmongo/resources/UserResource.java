package com.samuelsilva.workshopmongo.resources;

import com.samuelsilva.workshopmongo.domain.User;
import com.samuelsilva.workshopmongo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserServices services;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = services.findAll();

        System.out.println(list);

        return ResponseEntity.ok().body(list);
    }

}
