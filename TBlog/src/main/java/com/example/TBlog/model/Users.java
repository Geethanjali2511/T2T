package com.example.TBlog.model;

public class Users {

    private int user_id;
    private String user_role;
    private String user_name;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "user_id=" + user_id +
                ", user_role='" + user_role + '\'' +
                ", user_name='" + user_name + '\'' +
                '}';
    }
}
