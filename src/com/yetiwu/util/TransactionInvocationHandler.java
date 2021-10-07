package com.yetiwu.util;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransactionInvocationHandler implements InvocationHandler {
    // 目标类
    private Object target;

    public TransactionInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        SqlSession sqlSession = null;
        try{
            // 获取SqlSession对象
            sqlSession = SqlSessionUtil.getSqlSession();
            // 执行目标类中的目标方法
            obj = method.invoke(target, args);
            // 提交事务
            sqlSession.commit();
        }catch(Exception e){
            // 回滚事务
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            SqlSessionUtil.closeSqlSession(sqlSession);
        }
        return obj;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }
}
