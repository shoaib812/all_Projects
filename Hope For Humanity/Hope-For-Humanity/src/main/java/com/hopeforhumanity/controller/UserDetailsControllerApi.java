package com.hopeforhumanity.controller;

import com.hopeforhumanity.entity.UserDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface UserDetailsControllerApi {

    @PostMapping
    public UserDetails createuserDetail(@RequestBody UserDetails userDetails);

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserDetails>> getSingleUserDetails(@PathVariable Long id);

    @GetMapping
    public ResponseEntity<List<UserDetails>> getAllUserDetails();
}