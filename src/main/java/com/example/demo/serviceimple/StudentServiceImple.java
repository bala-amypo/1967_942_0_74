package com.example.demo.serviceimple;

import org.springframework.stereotype.Service;

import com.example.demo.entity.stuentity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImple implements StudentService{

    private final StudentRepository studentRespository;
    public StudentServiceImple(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    public Stuentity saveStuentity(Stuentity student){
        return 
    }
}