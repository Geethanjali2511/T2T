package com.example.TBlog.services;

import com.example.TBlog.repository.UsersRepository;
import com.example.TBlog.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepository;


    public List<Users> getAllUsers(){
        return usersRepository.findAllUsers();

    }
    public void createUsers(Users users){
        usersRepository.saveNewUsers(users);
    }

    public Users getUsersById(int id){

        return usersRepository.getOneById(id);
    }
}
