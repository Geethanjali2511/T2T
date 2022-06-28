package com.example.TBlog.controller;

import com.example.TBlog.services.PostService;
import com.example.TBlog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/post")
    public List<Post>getAllPost(){
        return postService.getAllPost();
    }



    @PostMapping("/post")
    public ResponseEntity<?> createPost(@RequestBody Post post){
        postService.createPost(post);
        return ResponseEntity.status(HttpStatus.CREATED).body(post);
    }

    @GetMapping("/post/{id}")
    Post findPostByID(@PathVariable int id) {
        return postService.getPostById(id);
    }
}


