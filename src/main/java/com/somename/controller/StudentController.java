package com.somename.controller;


import com.somename.entity.Student;
import com.somename.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
//@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    }

    @RequestMapping(value = "/geth", method = RequestMethod.GET)
    public String getHTML(){
        return "<html>" +
                "<head>" +
                "</head>" +
                "<body>" +
                "Hello World" +
                "</body" +
                "</html>";
    }

}
