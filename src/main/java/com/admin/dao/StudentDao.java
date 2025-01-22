package com.admin.dao;

import com.admin.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

public interface StudentDao {
    Student getById(Integer studentId);

    String deleteById(Integer studentId);

    String insertByName(String studentName);

    String insertBatchByName(List<Student> studentList);
}
