package com.example;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudent() {
        return this.studentList;
    }
    public void addStudent(Student student) {
        studentList.add(student);
    }
    public Student getStudentById(int id) {
        return studentList.stream().filter((student) -> student.getId() == id).findFirst().orElse(null);
    }
    public Student getStudentByName(String name) {
        return studentList.stream()
                .filter((student) -> student.getName().equals(name)).findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student not found with name : " + name));
    }
}
