package com.dummyproject.service.impl;

import com.dummyproject.entity.User;
import com.dummyproject.exception.ResourceNotFoundException;
import com.dummyproject.repository.UserRepository;
import com.dummyproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        //generate unique userId
        String rendomUserId = UUID.randomUUID().toString();
        user.setId(rendomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(String id) {
        //return userRepository.findById(id);
        return Optional.ofNullable(userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(" User id is not found on server !! : " + id)));
    }
}
