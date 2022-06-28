package com.example.TBlog.repository;

import com.example.TBlog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PostRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Post> findAllPost(){
        List<Post> result = jdbcTemplate.query("select * from post", new PostRowMapper());

        return result;
    }

    public Post findOnePost(int id){
        String mySql = "select * from post  where post_id = ?";
        Post p =  jdbcTemplate.queryForObject(mySql, new PostRowMapper(), id );
        return p;
    }

    public Post getOneById(int id) {
        String mysql = "select * from Post where post_id = ?";
        Post p = jdbcTemplate.queryForObject(mysql, new PostRowMapper(), id);
        return p;
    }

    public void saveNewPost(Post post) {
        String mysql = "insert into post(post_id, post_date, post_title, post_content, post_url, post_video, post_image, user_id) values(?,?,?,?,?,?,?,?)";
        int num = jdbcTemplate.update(mysql, post.getPost_id(), post.getPost_date(), post.getPost_title(), post.getPost_content(), post.getPost_url(), post.getPost_video(), post.getPost_image(), post.getUser_id());
        System.out.println(num);

    }

    private class PostRowMapper implements RowMapper<Post>
    {
        public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
            Post post = new Post();
            post.setPost_id(rs.getInt("post_id"));
            post.setPost_date(rs.getDate("post_date"));
            post.setPost_title(rs.getString("post_title"));
            post.setPost_content(rs.getString("post_content"));
            post.setPost_url(rs.getString("post_url"));
            post.setPost_video(rs.getString("post_video"));
            post.setPost_image(rs.getString("post_image"));
            post.setUser_id(rs.getInt("user_id"));
            return post;
        }


        }
    }