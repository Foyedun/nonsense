package dev.fabulous.com.service;

import dev.fabulous.com.entities.User;

import java.util.Optional;

public interface UserService {
    User createUser(User user);

    User findUserByEmailAndPassword(User user);

    User findById(Long id);
}
