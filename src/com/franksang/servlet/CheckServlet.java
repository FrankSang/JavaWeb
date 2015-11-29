package com.franksang.servlet;

import com.franksang.entity.User;
import com.franksang.service.CheckUserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by root on 11/29/15.
 */
public class CheckServlet extends HttpServlet {
    public CheckServlet()
    {
        super();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        String username=req.getParameter("uname");
        String password= req.getParameter("upwd");
        RequestDispatcher rd=null;
        String forward=null;

        if(username==null || password==null)
        {
            req.setAttribute("msg","用户名或者密码为空");
            rd=req.getRequestDispatcher("/pages/faile.jsp");
            rd.forward(req,resp);
        }else{
            User user= new User();
            user.setUname(username);
            user.setUpwd(password);
            boolean login=new CheckUserService().check(user);
            if(login)
            {
                rd=req.getRequestDispatcher("/pages/sucess.jsp");
                rd.forward(req,resp);
            }else
            {
                rd=req.getRequestDispatcher("/pages/faile.jsp");
                rd.forward(req,resp);
            }
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp );
    }
}
