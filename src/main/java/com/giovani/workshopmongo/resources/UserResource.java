package com.giovani.workshopmongo.resources;

import com.giovani.workshopmongo.domain.User;
import com.giovani.workshopmongo.dto.UserDTO;
import com.giovani.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserResource {


    @Autowired
    private UserService userService;


    // ResponseEntity é uma reseposta http ja com possiveis cabeçalhos possiveis erros
    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> list =userService.findAll();
        // stream : converte a lista em uma coleção compativel com as expressoes lambida
        // map vai pegar cada objeto X na list e retorna um novo usuarioDTO
        List<UserDTO> listDtos = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());

        return ResponseEntity.ok().body(listDtos);
    }
    // ResponseEntity é uma reseposta http ja com possiveis cabeçalhos possiveis erros

    @GetMapping(value="/{id}")
    public ResponseEntity<UserDTO> findAll(@PathVariable String id) {
        User user = userService.findById(id);
        // converter para dto
        return ResponseEntity.ok().body(new UserDTO(user));
    }




}
