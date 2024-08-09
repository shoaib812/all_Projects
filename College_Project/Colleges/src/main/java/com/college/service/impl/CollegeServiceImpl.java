package com.college.service.impl;

import com.college.entity.College;
import com.college.repository.CollegeRepository;
import com.college.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    @Override
    public College createCollege(College college) {
        String id = UUID.randomUUID().toString();
        college.setCollegeId(id);
        return collegeRepository.save(college);
    }

    @Override
    public List<College> getAll() {
        return collegeRepository.findAll();
    }

    @Override
    public Optional<College> get(int collegeId) {
        return collegeRepository.findById(collegeId);
    }

    @Override
    public void deleteCollege(int id) {

    }
}
