package com.kyx.controller;

import com.kyx.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created By Kan on 2020/12/1.
 * Description: what for
 */
public class TwoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student = new Student("A1001", "ann", 22);
        Student student2 = new Student("A1002", "bob", 23);

        //{"s1":{"id":"?", "name":"?", "age":?}, "s2":{"id":"?", "name":"?", "age":?}}
//        String str = "{\"id\":\""+student.getId()+"\", \"name\":\""+student.getName()+"\", \"age\":"+student.getAge()+"}";
        String str = "{\"s1\":{\"id\":\""+student.getId()
                +"\", \"name\":\""+student.getName()
                +"\", \"age\":"+student.getAge()
                +"}, \"s2\":{\"id\":\""+student2.getId()
                +"\", \"name\":\""+student2.getName()
                +"\", \"age\":"+student2.getAge()
                +"}}";
        PrintWriter out = response.getWriter();
        out.print(str);
        out.close();
    }
}
