package com.yetiwu.dao;

import com.yetiwu.domain.Student;
import com.yetiwu.vo.StudentAndClassVo;

import java.util.List;

public interface StudentDao {
    // 根据学生编号查询学生信息
    public Student selectById(String id);

    // 添加学生
    public void insertStu(Student student);

    // 模糊查询
    List<Student> selectByLike(String z);

    List<Student> select1(Student stu);

    List<Student> select2(String[] stuArr);

    List<StudentAndClassVo> select3();
}
