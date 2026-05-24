package com.samuelsilva.workshopmongo.repository;

import com.samuelsilva.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post,String > {
}
