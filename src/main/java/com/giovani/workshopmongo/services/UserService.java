package com.giovani.workshopmongo.services;

import com.giovani.workshopmongo.domain.User;
import com.giovani.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    // o proprio spring procura a definição do objeto e faz a instancia dele
    @Autowired
    UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
}
