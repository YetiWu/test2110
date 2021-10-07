package com.yetiwu.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class LocalFreshServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        int num = random.nextInt(100000) + 1;
        String res = "这次的随机数是： " + num;
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(res);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
