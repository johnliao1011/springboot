package com.admin.service;

import com.admin.dao.StudentDao;
import com.admin.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentDao studentDao;

    @Override
    public Student getById(Integer studentId) {
        return studentDao.getById(studentId);
    }

    @Override
    public String deleteById(Integer studentId) {
        return studentDao.deleteById(studentId);
    }

    @Override
    public String insertByName(String studentName) {
        return studentDao.insertByName(studentName);
    }

    @Override
    public String insertBatchByName(List<Student> studentList) {
        return studentDao.insertBatchByName(studentList);
    }
}
