package com.hopeforhumanity.service.impl;

import com.hopeforhumanity.entity.UserDetails;
import com.hopeforhumanity.model.request.UserDetailsPostRequest;
import com.hopeforhumanity.repository.UserDetailsRepository;
import com.hopeforhumanity.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDetailsImpl implements UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Override
    public UserDetails save(UserDetails userDetails) {
        return userDetailsRepository.save(userDetails);
    }

    @Override
    public List<UserDetails> getAll() {
        return userDetailsRepository.findAll();
    }

    @Override
    public Optional<UserDetails> getById(long id) {
        return userDetailsRepository.findById(id);
    }
}
