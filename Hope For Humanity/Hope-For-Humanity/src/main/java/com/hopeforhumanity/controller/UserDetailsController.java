package com.hopeforhumanity.controller;

import com.hopeforhumanity.entity.UserDetails;
import com.hopeforhumanity.model.request.UserDetailsPostRequest;
import com.hopeforhumanity.model.response.UserDetailsResponse;
import com.hopeforhumanity.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/userDetails")
public class UserDetailsController implements UserDetailsControllerApi {

    @Autowired
    UserDetailsService userDetailsService;

    @Override
    public UserDetails createuserDetail(UserDetails userDetails) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userDetailsService.save(userDetails)).getBody();
    }

    @Override
    public ResponseEntity<Optional<UserDetails>> getSingleUserDetails(Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(userDetailsService.getById(id));
    }

    @Override
    public ResponseEntity<List<UserDetails>> getAllUserDetails() {
        return ResponseEntity.ok(userDetailsService.getAll());
    }
}
