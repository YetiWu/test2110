package com.yetiwu.test;

import com.yetiwu.domain.Student;
import com.yetiwu.service.StudentService;
import com.yetiwu.service.impl.StudentServiceImpl;
import com.yetiwu.util.ServiceFactory;
import com.yetiwu.util.TransactionInvocationHandler;

public class Test01 {
    /*public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            InputStream in = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            sqlSession = factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 按标号查询
        *//*Student res = sqlSession.selectOne("test1.selectById", "A002");
        System.out.println(res);
        *//*

        // 查询所有
        *//*List<Student> slist = sqlSession.selectList("test1.searchAll");
        for(Student stu : slist){
            System.out.println(stu);
        }
        *//*

        // 添加操作
        *//*Student newStu = new Student();
        newStu.setId("A006");
        newStu.setName("gxt");
        newStu.setAge(24);
        sqlSession.insert("test1.insertOpr",newStu);
        // mybatis默认是手动提交事务的
        sqlSession.commit();
        *//*

        // 更新操作
        *//*Student newStu = new Student();
        newStu.setId("A006");
        newStu.setName("lbw");
        newStu.setAge(33);
        sqlSession.update("test1.updateOpr",newStu);*//*

        // 删除操作
        sqlSession.delete("test1.deleteOpr","A006");
        sqlSession.commit();
        sqlSession.close();
    }*/
    public static void main(String[] args) {
        StudentService service  = new StudentServiceImpl();
        StudentService proxy = (StudentService) ServiceFactory.getService(service);
        /*Student stu = new Student();
        stu.setId("A007");
        stu.setName("cwt");
        stu.setAge(33);
        proxy.insertStu(stu);*/
        Student student = proxy.selectById("A004");
        System.out.println(student);
    }
}
