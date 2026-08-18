package com.example.assertions;

import com.example.Student;
import com.example.StudentService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    @Test
    public void getStudentTest() {
        StudentService studentService = new StudentService();
        Student s1 = new Student(1, "Hicham");
        List<Student> listOfStudents = studentService.getStudent();
        studentService.addStudent(s1);

        boolean actualResult = listOfStudents.isEmpty();

        // assertTrue(actualResult);   //   assertTrue  test if actualResult is True

        // assertTrue(() -> actualResult);

        // assertTrue(actualResult, "List Of Student is empty!");

        // assertTrue(() -> actualResult, "List Of Student is empty!");

    }
    @Test
    public void getStudentTestUsingAssertFalse() {
        StudentService studentServiceFalse = new StudentService();
        List<Student> listOfStudents = studentServiceFalse.getStudent();

        Student s1 = new Student(1, "Hicham");
        studentServiceFalse.addStudent(s1);

        boolean actualResult = listOfStudents.isEmpty();

         // assertFalse(actualResult);   //  assertFalse test if actualResult is False

        // assertFalse(actualResult, "Student list should not be empty!");

        // assertFalse(() -> actualResult);

        assertFalse(() -> actualResult, "Student list should not be empty!");
    }
    @Test
    public void getStudentByIdTestUsingAssertNull() {
        StudentService studentService = new StudentService();
        Student s1 = new Student(1 , "Hicham");
        studentService.addStudent(s1);

        Student actualStudent = studentService.getStudentById(3);

        //assertNull(actualStudent);  //  assertNull test if actualStudent is Null

        assertNull(actualStudent, "Student object is not null");
    }
    @Test
    public void getStudentByIdTestUsingAssertNotNull() {
        StudentService studentService = new StudentService();
        Student s1 = new Student(1 , "Hicham");
        studentService.addStudent(s1);

        Student actualStudent = studentService.getStudentById(1);

        // assertNotNull(actualStudent);  //  assertNotNull test if actualStudent is Not Null

        assertNotNull(actualStudent, () -> "Student is null!");
    }

}