package com.kevin.server;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevin.server.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
