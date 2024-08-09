package com.hopeforhumanity.service;

import com.hopeforhumanity.entity.UserDetails;

import java.util.List;
import java.util.Optional;

public interface UserDetailsService {

    public UserDetails save(UserDetails userDetails);

    public List<UserDetails> getAll();

    public Optional<UserDetails> getById(long id);
}
