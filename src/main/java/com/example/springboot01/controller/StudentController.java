package com.example.springboot01.controller;

import com.example.springboot01.Service.StudentService;
import com.example.springboot01.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping("/findAll")
    public List<Student> findAll(){

        List<Student> all = studentService.findAll();
        for (Student s: all
             ) {
            System.out.println(s.toString());
        }

        return all;
    }

    @GetMapping("/findAll2")
    public List<Student> findAll2(){
        Student student = new Student();
        student.setName("小兰");
        List<Student> all = studentService.findAllByS(student);
        for (Student s: all
        ) {
            System.out.println(s.toString());
        }

        return all;
    }
}
