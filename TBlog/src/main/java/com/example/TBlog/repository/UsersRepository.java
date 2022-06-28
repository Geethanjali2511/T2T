package com.example.TBlog.repository;

import com.example.TBlog.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UsersRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Users> findAllUsers(){
        return jdbcTemplate.query("select * from Users", new UsersRowMapper());
    }

    public Users getOneById(int id){
        String mysql="select * from Users where user_id= ?";
        Users u =  jdbcTemplate.queryForObject(mysql, new UsersRowMapper(), id );
        return u;

    }
    public void saveNewUsers(Users users){
        String mySql = "insert into users(user_id, user_role, user_name) values (?,?,?)";
        int num = jdbcTemplate.update(mySql, users.getUser_id(), users.getUser_role(), users.getUser_name());
        System.out.println(num);
    }
    private class UsersRowMapper implements RowMapper<Users>
    {
        public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
            Users users = new Users();
            users.setUser_id(rs.getInt("user_id"));
            users.setUser_role(rs.getString("user_role"));
            users.setUser_name(rs.getString("user_name"));
            return users;
        }
    }

}


