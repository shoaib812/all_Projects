package com.college.service;

import com.college.entity.College;

import java.util.List;
import java.util.Optional;

public interface CollegeService {

    public College createCollege(College college);

    public List<College> getAll();

    public Optional<College> get(int collegeId);

    public void deleteCollege(int id);
    
}
