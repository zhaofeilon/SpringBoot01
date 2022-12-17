package com.example.springboot01.Service.Impl;

import com.example.springboot01.Service.StudentService;
import com.example.springboot01.entity.Student;
import com.example.springboot01.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}
