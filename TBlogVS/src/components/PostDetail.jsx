import React, { useEffect, useState, axios } from 'react'
import { useParams } from 'react-router-dom'

const PostDetail = () => {

    const [post, setPost] = useState({})

const {post_id} =useParams();


useEffect(() => {
  getPostById(post_id)
  

}, [])

function getPostById(id) {
  axios.get(`http://localhost:8080/post/${id}`)
      .then(response => {
          setPost(response.data)
      })
      .catch(error => {
          console.log(error)
      })
}

  return (
    <><div>Post id is {post_id}</div><h1>{post.post_id}</h1><h1>{post.post_date}</h1><h1>{post.post_title}</h1><h1>{post.post_content}</h1><h1>{post.post_url}</h1><h1>{post.post_video}</h1><h1>{post.post_image}</h1></>
    
    
  )
}

export default PostDetail