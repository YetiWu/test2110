package com.yetiwu.test;

import com.yetiwu.dao.StudentDao;
import com.yetiwu.domain.Student;
import com.yetiwu.service.StudentService;
import com.yetiwu.service.impl.StudentServiceImpl;
import com.yetiwu.util.ServiceFactory;
import com.yetiwu.util.SqlSessionUtil;
import com.yetiwu.vo.StudentAndClassVo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Tets02 {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        // select1：动态sql 的where 和 if的使用
        /*Student stu = new Student();
        stu.setName("z");
        stu.setAge(25);
        List<Student> students = dao.select1(stu);
        for (Student student : students) {
            System.out.println(student);
        }*/

        // select2：动态sql的 foreach的使用
        /*String stuArr[] = {"A001","A002","A003"};
        List<Student> students = dao.select2(stuArr);
        for(Student student : students){
            System.out.println(student);
        }*/

        // select3：vo的使用 vo（value object / view object），从来将结果返回给前台页面的
        /*
            当我们查询的结果不能封装到domain中的时候可以有两种解决方案：
            第一种：使用map
            当我们对该业务不经常使用的情况下可以使用map，因为map的遍历太麻烦
            但是不需要再创建一个类

            第二种：使用vo类
            当我们对该业务经常使用的情况下可以使用vo类，因为vo类可以复用，并且遍历简单
            但是我们要多写一个vo类，如果每次都写的话，就会造成我们的项目规模变得庞大，臃肿
         */
        List<StudentAndClassVo> list = dao.select3();
        for(StudentAndClassVo vo : list ){
            System.out.println(vo);
        }

    }
}
