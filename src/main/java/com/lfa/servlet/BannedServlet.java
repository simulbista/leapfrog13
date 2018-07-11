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
@WebServlet(name = "banned", urlPatterns = "/banned")
public class BannedServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
//        response.getWriter().println("Ip add: " + request.getRemoteAddr());
        request.
                getRequestDispatcher("/WEB-INF/views/banned.jsp")
                .forward(request, response);
    }

}
