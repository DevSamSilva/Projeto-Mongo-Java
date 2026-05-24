package com.samuelsilva.workshopmongo.services;

import com.samuelsilva.workshopmongo.domain.User;
import com.samuelsilva.workshopmongo.dto.UserDTO;
import com.samuelsilva.workshopmongo.repository.UserRepository;
import com.samuelsilva.workshopmongo.services.exception.ObjectNotFoundException;
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

    public User findById(String id){
        User user = repo.findById(id).orElse(null);
        if (user == null){
            throw new ObjectNotFoundException("Objeto não encontrado");
        }

        return user;
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public User fromDTO(UserDTO obj){
        return new User(obj.getId(), obj.getName(),obj.getEmail());
    }

}
