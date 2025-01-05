package com.giovani.workshopmongo.resources;

import com.giovani.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    // ResponseEntity é uma reseposta http ja com possiveis cabeçalhos possiveis erros
/*
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1","maria","maria@gmail.com");
        User alex = new User("2","alex","alex@gmail.com");

        List<User> list = new ArrayList<User>();
        list.add(maria);
        list.add(alex);
        return ResponseEntity.ok().body(list);
    }

    */

    @GetMapping
    public List<User> findAll() {
        User maria = new User("1","maria","maria@gmail.com");
        User alex = new User("2","giovani","alex@gmail.com");

        List<User> list = new ArrayList<User>();
        list.add(maria);
        list.add(alex);
        return list;
    }
}
