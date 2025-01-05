package com.giovani.workshopmongo.resources;

import com.giovani.workshopmongo.domain.User;
import com.giovani.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {


    @Autowired
    private UserService userService;


    // ResponseEntity é uma reseposta http ja com possiveis cabeçalhos possiveis erros
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list =userService.findAll();
        return ResponseEntity.ok().body(list);
    }




}
