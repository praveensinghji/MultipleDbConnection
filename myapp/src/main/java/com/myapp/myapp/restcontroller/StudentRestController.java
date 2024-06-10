package com.myapp.myapp.restcontroller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.myapp.model.Student;
import com.myapp.myapp.repo.StudentRepo;

@RestController
public class StudentRestController {
    @Autowired
    private StudentRepo repo;

    @GetMapping("/students")
    public List<Student> findAllStudnet(){

        return repo.findAllStudent();
    }

    //Here I am creating for postman for inserting that Request Body.
    @PostMapping("/student")
    public String save(@RequestBody Student student){
         student.setModifiedDate(LocalDateTime.now());
        return repo.saveStudent(student);
    }

    @GetMapping("/student/{name}")
    public Student getStudentByName(@PathVariable String name){
        return repo.getStudentByName(name);
    }

    @GetMapping("/student")
    public Student getStudentByNameMethod2(@RequestBody String name){
        return repo.getStudentByName(name);
    }

    @GetMapping("/delete/{name}")
    public String deleteByName(@PathVariable String name){
        repo.deleteById(name);
        return "Delete Successfully";
    }
    @GetMapping("/get")
    public List<Student> ok(){
        List<Student> list = repo.getDate();
        for(Student student : list){
            LocalDate date = student.getModifiedDate().toLocalDate();
            student.setSendUIDate(date);
        }
        return list;
    }
}
