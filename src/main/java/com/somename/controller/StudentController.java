package com.somename.controller;


import com.somename.entity.Student;
import com.somename.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable("id") int id){
        return this.studentService.getStudent(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable("id") int id){
        this.studentService.deleteStudent(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateStudent(@RequestBody Student student){
        this.studentService.updateStudent(student);
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
