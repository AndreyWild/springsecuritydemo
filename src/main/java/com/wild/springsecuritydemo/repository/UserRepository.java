package com.wild.springsecuritydemo.repository;

import com.wild.springsecuritydemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

//    @Override
//    User saveAndFlush(User s);
}
