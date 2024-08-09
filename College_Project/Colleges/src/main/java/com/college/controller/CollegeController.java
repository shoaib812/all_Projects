package com.college.controller;

import com.college.entity.College;
import com.college.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/college")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @PostMapping
    public ResponseEntity<College> createCollege(@RequestBody College college) {
        return ResponseEntity.status(HttpStatus.CREATED).body(collegeService.createCollege(college));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<College>> getSingleCollege(@PathVariable int collegeId) {
        return ResponseEntity.status(HttpStatus.OK).body(collegeService.get(collegeId));
    }

    @GetMapping
    public ResponseEntity<List<College>> getAll() {
        return ResponseEntity.ok(collegeService.getAll());
    }

    @DeleteMapping
    public Integer deleteCollege(int collegeId) {
        collegeService.deleteCollege(collegeId);
        return collegeId;
    }
}
