package com.giovani.workshopmongo.repository;


import com.giovani.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


    // mongoRepository < tipo de dominio que vai gerenciar, qual o tipo do id do user>

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}