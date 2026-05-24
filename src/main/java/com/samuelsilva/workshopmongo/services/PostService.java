package com.samuelsilva.workshopmongo.services;

import com.samuelsilva.workshopmongo.domain.Post;
import com.samuelsilva.workshopmongo.repository.PostRepository;
import com.samuelsilva.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post FindById(String id) {
        Post user = repo.findById(id).orElse(null);
        if (user == null) {
            throw new ObjectNotFoundException("Objeto nao encontrado");
        }
        return user;
    }

    public List<Post> findByTitle (String text){
        return repo.findByTitleContainingIgnoreCase(text);
    }


}
