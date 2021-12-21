package com.example.learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @GetMapping(path = "/student")
    public Student getStudent() {
        return new Student("John", "Peterson", 24);
    }

    @GetMapping(path = "/students-list")
    public List<Student> getListOfStudents() {

        return List.of(
                new Student("James", "Harvey", 28),
                new Student("Sarah", "Kyle", 23),
                new Student("Den", "Moore", 25),
                new Student("Gerrard", "Bailey", 26)
                );
    }

    @GetMapping("/students-list/{firstName}")
    public Student pathVariableStudentByFirstName(@PathVariable String firstName) {
        return new Student(firstName);
    }

    @GetMapping("/students-list/{firstName}/{lastName}")
    public Student pathVariableStudentByFirstAndLastNames(@PathVariable String firstName, @PathVariable String lastName) {
        return new Student(firstName, lastName);
    }


    @GetMapping("/student/query")
    public Student studentQueryParams(@RequestParam String firstName, @RequestParam String lastName) {
        return new Student(firstName, lastName);
    }

}
