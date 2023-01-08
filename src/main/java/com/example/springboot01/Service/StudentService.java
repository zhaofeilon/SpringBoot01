package com.example.springboot01.Service;

import com.example.springboot01.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    List<Student> findAllByS(Student student);
}
