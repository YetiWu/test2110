package com.yetiwu.service.impl;

import com.yetiwu.dao.StudentDao;
import com.yetiwu.domain.Student;
import com.yetiwu.service.StudentService;
import com.yetiwu.util.SqlSessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = SqlSessionUtil.getSqlSession().getMapper(StudentDao.class);
    @Override
    public Student selectById(String id) {
        Student student = studentDao.selectById(id);
        return student;
    }

    @Override
    public void insertStu(Student student) {
        studentDao.insertStu(student);
    }

    @Override
    public List<Student> selectByLike(String z) {
        List<Student> students = studentDao.selectByLike(z);
        return students;
    }
}
