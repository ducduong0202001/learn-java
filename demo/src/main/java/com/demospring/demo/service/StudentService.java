package com.demospring.demo.service;

import com.demospring.demo.Dto.StudenDto;
import com.demospring.demo.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    StudenDto findById(int id);
}
