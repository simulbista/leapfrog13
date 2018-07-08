/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 647-np
 */
@WebFilter(filterName = "tokenFilter", urlPatterns = "/admin/*")
public class AccessTokenFilter implements Filter {

    public void init(FilterConfig fc) throws ServletException {

    }

    public void doFilter(ServletRequest request,
            ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
        String validToken = "647";
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        if (req.getAttribute("validate") != null
                && Validator.validate((Boolean) req.getAttribute("validate"))) {
            filterChain.doFilter(req, resp);
        } else {
            String token = req.getParameter("token");
            if (token != null && token.equals(validToken)) {
//                setting loggedIn(i.e. verification via password) true as if you
//                        are checking by token, no need to check uasername & pass
                req.getSession().setAttribute("loggedIn", true);
                filterChain.doFilter(req, resp);
            } else {
                resp.sendRedirect("/login");
            }
        }
    }

    public void destroy() {

    }

}
