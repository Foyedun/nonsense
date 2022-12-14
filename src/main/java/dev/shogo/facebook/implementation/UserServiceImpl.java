package dev.shogo.facebook.implementation;

import dev.shogo.facebook.entities.User;
import dev.shogo.facebook.repository.UserRepository;
import dev.shogo.facebook.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public User findUserByEmailAndPassword(User user) {

        Optional<User>  foundUser = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());

        if(foundUser.isEmpty()){
            return null;
        }

        return foundUser.get();
    }

    @Override
    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            throw new IllegalStateException("User Not Found");
        }

        return user.get();
    }
}
