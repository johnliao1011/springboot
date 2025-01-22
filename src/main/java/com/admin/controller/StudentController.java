package com.admin.controller;

import com.admin.entity.Student;
import com.admin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/testException")
    public String testException(){
        throw new RuntimeException("Test Error");
    }

    @GetMapping("/query/{studentId}")
    public Student query(@PathVariable Integer studentId){
        return studentService.getById(studentId);
    }

    @GetMapping("/delete/{studentId}")
    public String delete(@PathVariable Integer studentId){
        return studentService.deleteById(studentId);
    }

    @PostMapping("/insert")
    public String insert(@RequestBody Student student){
        return studentService.insertByName(student.getName());
    }

    @PostMapping("/insertList")
    public String insertList(@RequestBody List<Student> studentList){
        return studentService.insertBatchByName(studentList);
    }
}
