package com.somename.service;


import com.somename.dao.StudentDao;
import com.somename.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return this.studentDao.getAllStudents();
    }

    public Student getStudent(int id){
        return this.studentDao.getStudent(id);
    }

    public void deleteStudent(int id) {
        this.studentDao.deleteStudent(id);
    }

    public void updateStudent(Student student){
        this.studentDao.updateStudent(student);
    }
}
