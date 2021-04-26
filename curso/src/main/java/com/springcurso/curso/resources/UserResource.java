package com.springcurso.curso.resources;

import com.springcurso.curso.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Heliezer Garcia", "heli2047@gmail.com", "19989161240", "Teste");

        return ResponseEntity.ok().body(u);
    }    
}
