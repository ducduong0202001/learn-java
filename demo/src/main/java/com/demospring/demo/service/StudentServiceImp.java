package com.demospring.demo.service;

import com.demospring.demo.Dto.StudenDto;
import com.demospring.demo.entity.Student;
import com.demospring.demo.repository.StudenRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImp implements  StudentService{
    @Autowired
    private StudenRepository repository;
    @Autowired
    private ModelMapper mapper;
    @Override
    public StudenDto findById(int id) {
        Student std = repository.findById(id);
        return mapper.map(std,StudenDto.class);
    }
}
