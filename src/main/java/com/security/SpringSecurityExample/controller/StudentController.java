package com.security.SpringSecurityExample.controller;

import com.security.SpringSecurityExample.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student("shantanu", 18, 9.41),
            new Student("shreyash", 14, 9.21)
    ));

    @GetMapping("/students")
    public List<Student> getListOfStudents(){
        return students;
    }

    @GetMapping("/csrf")
    public CsrfToken getToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        students.add(student);
    }
};
