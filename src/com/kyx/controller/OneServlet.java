package com.kyx.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created By Kan on 2020/11/30.
 * Description: what for
 */
public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Thread.sleep(2000);
            PrintWriter out = response.getWriter();
            out.print("abc");
            out.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
