package com.admin.service;

import com.admin.entity.Student;

import java.util.List;

public interface StudentService {
    Student getById(Integer studentId);

    String deleteById(Integer studentId);

    String insertByName(String studentName);

    String insertBatchByName(List<Student> studentList);
}
