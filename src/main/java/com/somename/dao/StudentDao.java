package com.somename.dao;


import com.somename.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "name_1", "course_1"));
                put(2, new Student(2, "name_2", "course_2"));
                put(3, new Student(3, "name_3", "course_3"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudent(int id){
        return this.students.get(id);
    }

    public void deleteStudent(int id) {
        this.students.remove(id);
    }

    public void updateStudent(Student student) {
        this.students.put(student.getId(), student);
    }
}
