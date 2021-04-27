package com.springcurso.curso.repositories;

import com.springcurso.curso.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
