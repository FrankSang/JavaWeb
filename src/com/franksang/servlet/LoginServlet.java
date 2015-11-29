package com.franksang.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by root on 11/29/15.
 */
public class LoginServlet extends HttpServlet {
/*    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        String username=req.getParameter("uname");
        String password=req.getParameter("upwd");
        System.out.println("username============="+username);
        System.out.println("passord==================="+password);
        PrintWriter out= resp.getWriter();
        out.write("Hello Login");
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===========进入doget方法=========");
        String username=req.getParameter("uname");
        String password=req.getParameter("upwd");
        System.out.println("username============="+username);
        System.out.println("passord==================="+password);
        PrintWriter out= resp.getWriter();
        out.write("Hello Login");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===========进入dopost方法=========");
        String username=req.getParameter("uname");
        String password=req.getParameter("upwd");
        System.out.println("username============="+username);
        System.out.println("passord==================="+password);
/*
        PrintWriter out= resp.getWriter();
        out.write("Hello Login");
        out.write(req.getContextPath());
        out.close();
*/

        if("FrankSang".equals(username) && "swx158048".equals(password))
        {
            //请求转发：只能转发到同一应用
            String forward=null;
            forward="/pages/sucess.jsp";
            //forward="http://www.sina.cn";
            RequestDispatcher rd= req.getRequestDispatcher(forward);
            rd.forward(req,resp);
            //重定向 ：可以重定向别的应用
            //resp.sendRedirect(req.getContextPath()+"/pages/sucess.jsp");
            //resp.sendRedirect("http://www.sina.cn");
        }
        else
        {
            //请求转发
            String forward=null;
            forward="/pages/faile.jsp";
            RequestDispatcher rd= req.getRequestDispatcher(forward);
            rd.forward(req,resp);
            //重定向
            // resp.sendRedirect(req.getContextPath()+"/pages/faile.jsp");
        }
    }
}
