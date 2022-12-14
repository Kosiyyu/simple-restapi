package com.proj.restapi.service;

import com.proj.restapi.model.Student;
import com.proj.restapi.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Student findById(long id){
        return studentRepository.findById(id).get();
    }

    public void save(Student student){
        studentRepository.save(student);
    }

    public void update(long id, Student student){
        Student s = studentRepository.findById(id).get();
        studentRepository.save(s);
    }

    public void delete(long id){
        studentRepository.deleteById(id);
    }
}
