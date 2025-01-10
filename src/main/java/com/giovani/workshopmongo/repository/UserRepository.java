package com.giovani.workshopmongo.repository;


import com.giovani.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // mongoRepository < tipo de dominio que vai gerenciar, qual o tipo do id do user>
}
