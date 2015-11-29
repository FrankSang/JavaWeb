package com.franksang.servlet;

/**
 * Created by root on 11/29/15.
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TreeDataServlet extends HttpServlet{

    private String getData(){
        StringBuffer sb = new StringBuffer();
        sb.append("Hello~First Servlet!");
        return sb.toString();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
//      super.doGet(req, resp);
        String data = this.getData();
        resp.setContentType("text/html;charset=UTF-8");
        resp.getOutputStream().write(data.getBytes("UTF-8"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
//      super.doPost(req, resp);
    }
}
