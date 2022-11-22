package dev.shogo.facebook.service;

import dev.shogo.facebook.entities.User;

public interface UserService {
    User createUser(User user);

    User findUserByEmailAndPassword(User user);

    User findById(Long id);
}
