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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 647-np
 */
@WebFilter(filterName = "banned", urlPatterns = "/*")
public class BannedFilter implements Filter {

    public void init(FilterConfig fc) throws ServletException {
    }

    public void doFilter(ServletRequest request,
            ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        System.console().writer().println("Ip : " + request.getRemoteAddr());

//            server goes to infinite loop as the banned page will also apply 
//            this banned filter, to avoid this we use another condition
//            after && in if()
        if (req.getRemoteAddr().equals("27.34.20.84")
                && !req.getRequestURI().contains("/banned")) {
            resp.sendRedirect("/banned");
        } else {
            filterChain.doFilter(req, resp);
        }
    }

    public void destroy() {
    }

}
