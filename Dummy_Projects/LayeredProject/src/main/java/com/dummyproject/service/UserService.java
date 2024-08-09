package com.dummyproject.service;


import com.dummyproject.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    Optional<User> getUser(String id);

}
