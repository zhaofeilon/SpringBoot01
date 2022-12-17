package com.example.springboot01.mapper;

import com.example.springboot01.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> findAll();
}
