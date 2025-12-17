package com.example.demo.controller;

import org
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bnd.annotation.Restcontroller;

import com.example.demo.entity.Stuentity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController{
    @Autowired
    StudentService studentService;

    @PostMapping("/postdata")
    public Student postdata(@RequestBody Stuentity student){
        return studentService.saveStuentity(student);
    }

}