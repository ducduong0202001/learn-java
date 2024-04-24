package com.demospring.demo.repository;

import com.demospring.demo.Dto.StudenDto;
import com.demospring.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudenRepository extends JpaRepository<Student, Integer> {
    Student findById(int id);
}
