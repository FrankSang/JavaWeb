package com.franksang.entity;

/**
 * Created by root on 11/29/15.
 */
public class User {

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long id;
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    private String uname;
    private String upwd;

    public User()
    {}
    public User(long id,String uname,String upwd,String email)
    {
        this.id=id;
        this.uname=uname;
        this.upwd=upwd;
        this.email=email;
    }
}
