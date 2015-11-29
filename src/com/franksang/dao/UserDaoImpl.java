package com.franksang.dao;

import com.franksang.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by root on 11/29/15.
 */
public class UserDaoImpl implements UserDao{

    @Override
    public void save(Connection conn, User user) throws SQLException {
        PreparedStatement ps= conn.prepareCall("insert into tbl_user(name,password,email)values(?,?,?)");
        ps.setString(1,user.getUname());
        ps.setString(2,user.getUpwd());
        ps.setString(3,user.getEmail());
        ps.execute();
    }

    @Override
    public void update(Connection conn, long id, User user) throws SQLException {

         String updatesql="update tbl_user set name=?,password=?,email=? where id=?";
         PreparedStatement ps = conn.prepareStatement(updatesql);
        ps.setString(1,user.getUname());
        ps.setString(2,user.getUpwd());
        ps.setString(3,user.getEmail());
        ps.setLong(4,id);
        ps.execute();


    }

    @Override
    public void delete(Connection conn, User user) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("Delete from tbl_user where id=?");
        ps.setLong(1,user.getId());
        ps.execute();

    }

    @Override
    public ResultSet get(Connection conn, User user) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("Select * from tbl_user where name=? and password=? ");
        ps.setString(1,user.getUname());
        ps.setString(2,user.getUpwd());
        return ps.executeQuery();
        //return null;
    }
}
