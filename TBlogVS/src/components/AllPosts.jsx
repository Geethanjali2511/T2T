import React, { useEffect, useState } from 'react'
import Post from './Post'
import {Row, Col} from 'react-bootstrap';
import PostForm from './PostForm'
import axios from 'axios';


const AllPosts = () => {

    const [post, setPost] =useState([]);

    function getAllPosts(){
      axios.get("http://localhost:8080/post")
      .then(response =>{
        console.log(response);
        setPost(response.data);
      })
      .catch(error =>{
        console.log(error);
      })
    }

    useEffect(() =>{
      getAllPosts()
    }, [])
    

    
    let postList = post.map(post =>
      <div key={post.post_id}>
        <Post post={post} />
      </div>)

    const addNewPost = (post) => {
       axios.post("http://localhost:8080/post",post)
       .then (response =>{
          getAllPosts();
       })
       .catch(error=>{
        console.log(error);
       })

  }

  return (
      <><h1> AllPosts: </h1><Row>
      <Col>{postList}</Col>
      <Col><PostForm submitForm={addNewPost} /></Col>
    </Row></>
    
  )
}

export default AllPosts