package com.franksang.service;

import com.franksang.dao.UserDao;
import com.franksang.dao.UserDaoImpl;
import com.franksang.entity.User;
import com.franksang.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by root on 11/29/15.
 */
public class CheckUserService {
    private UserDao ud= new UserDaoImpl();
    public boolean check (User user)
    {
        Connection conn=null;
        try {
            conn=JdbcUtils.getInstance().getConnection();
            conn.setAutoCommit(false);
            while(ud.get(conn,user).next())
            {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try{
               conn.rollback();
            }
            catch(SQLException e2){
                e2.printStackTrace();
            }

        } finally {
            JdbcUtils.getInstance().free(null,null,conn);
        }

        return false;
    }
}
