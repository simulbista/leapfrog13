/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 647-np
 */
@WebServlet(name = "adminCategory", urlPatterns = "/admin/categories")
public class AdminCategoryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Admin Categories(secured area)!</h1>");
        writer.println("<form method='post'><input type = 'text' name = 'name'/>"
                + "<button type='submit'>Submit</button>"
                + "</form>");
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Admin Categories Post : secured area!</h1>");
        writer.println("Category name :" + request.getParameter("name"));
    }
}
