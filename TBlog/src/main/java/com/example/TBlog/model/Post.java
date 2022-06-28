package com.example.TBlog.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Post {

    private int post_id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date post_date;

    private String post_title;
    private String post_content;
    private String post_url;
    private String post_video;
    private int user_id;
    private String post_image;

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public Date getPost_date() {
        return post_date;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getPost_content() {
        return post_content;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

    public String getPost_url() {
        return post_url;
    }

    public void setPost_url(String post_url) {
        this.post_url = post_url;
    }

    public String getPost_video() {
        return post_video;
    }

    public void setPost_video(String post_video) {
        this.post_video = post_video;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPost_image() {
        return post_image;
    }

    public void setPost_image(String post_image) {
        this.post_image = post_image;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post_id=" + post_id +
                ", post_date=" + post_date +
                ", post_title='" + post_title + '\'' +
                ", post_content='" + post_content + '\'' +
                ", post_url='" + post_url + '\'' +
                ", post_video='" + post_video + '\'' +
                ", user_id=" + user_id +
                ", post_image='" + post_image + '\'' +
                '}';
    }
}


