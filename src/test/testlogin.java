package test;

import com.franksang.dao.UserDao;
import com.franksang.dao.UserDaoImpl;
import com.franksang.entity.User;
import com.franksang.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by root on 11/29/15.
 */
public class testlogin {

    public static void main(String[] args) {

        UserDao ud= new UserDaoImpl();
        User user= new User(1,"FrankSang","swx158048","sangdq25@gmail.com");
        Connection conn=null;
        try {
            conn= JdbcUtils.getInstance().getConnection();
            conn.setAutoCommit(false);
            /*while(ud.get(conn,user).next())
            {*/
                System.out.println("logincheck====="+true);
           /* }*/
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
    }

    }

