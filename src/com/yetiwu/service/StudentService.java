package com.yetiwu.service;

import com.yetiwu.domain.Student;

import java.util.List;

public interface StudentService {
    // 根据学生编号查询学生信息
    public Student selectById(String id);

    // 添加学生
    public void insertStu(Student student);

    // 模糊查询
    List<Student> selectByLike(String z);

}
