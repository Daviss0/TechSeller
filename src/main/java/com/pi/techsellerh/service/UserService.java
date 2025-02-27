package com.pi.techsellerh.service;

import com.pi.techsellerh.controller.CreateUserDto;
import com.pi.techsellerh.controller.UpdateUserDto;
import com.pi.techsellerh.entity.User;
import com.pi.techsellerh.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class UserService {


    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UUID createUser(CreateUserDto createUserDto) {

       var entity =  new User(
                null,
                createUserDto.username(),
                createUserDto.email(),
                createUserDto.password(),
                createUserDto.ativo(),
                createUserDto.role(),
                Instant.now(),
                null);

       var userSaved = userRepository.save(entity);

       return userSaved.getUserId();

    }

    public Optional<User> getUserById(String userId) {

        return userRepository.findById(UUID.fromString(userId));
    }

    public List<User> listUsers() {
        return userRepository.findAll();
    }

    public void updateUserById(String userId,
                               UpdateUserDto updateUserDto) {

        var id = UUID.fromString(userId);

        var userEntity = userRepository.findById(id);

        if (userEntity.isPresent()) {
            var user = userEntity.get();

            if (updateUserDto.username() != null) {
                user.setUsername(updateUserDto.username());
            }

            if (updateUserDto.password() != null) {
                user.setPassword(updateUserDto.password());
            }

            userRepository.save(user);
        }

    }

    public void deleteById(String userId) {

        var id = UUID.fromString(userId);

        var userExists = userRepository.existsById(id);

        if (userExists) {
            userRepository.deleteById(id);
        }
    }
}
