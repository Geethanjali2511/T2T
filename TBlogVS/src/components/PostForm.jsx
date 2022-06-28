
import React, { useState } from 'react'
import { Form, Button } from 'react-bootstrap';



const PostForm = (props) => {
    const [postTitle, setPostTitle] = useState('');
    const [postId, setPostId] = useState(''); 
    const [post_date, setPostDate] =useState('');
    const [post_content, setPostContent] =useState('');
    const [post_url, setPostUrl]=useState('');
    const [post_image, setPostImage]=useState('');
    const [post_video,setPostVideo]= useState('');
    const [User_id,setUserId]=useState('');

  



    const addPost = (event) =>{
        event.preventDefault();
        let post = {
            "post_title" : postTitle,
            "post_id" : postId,
            "post_date": post_date,
            "post_content": post_content,
            "post_url" : post_url,
            "post_image" : post_image,
            "post_video" : post_video,
            "user_id" : User_id




        }
        console.log(post);
        props.submitForm(post);
    }

  return (
    <Form onSubmit={addPost}>

    <Form.Group className="mb-3" controlId="formPostTitle">
      <Form.Label>Post Title</Form.Label>
      <Form.Control type="text" placeholder="Enter The Post Title" value={postTitle}
       onChange ={(event)=> setPostTitle(event.target.value)} />
    </Form.Group>

    <Form.Group className="mb-3" controlId="formPostId">
      <Form.Label>Post Id</Form.Label>
      <Form.Control type="text" placeholder="Enter Post Id" value={postId}
      onChange ={(event)=>setPostId(event.target.value)}/>
    </Form.Group>

    
    <Form.Group className="mb-3" controlId="formPost_date">
      <Form.Label>Post Date</Form.Label>
      <Form.Control type="text" placeholder="Enter Post Date" value={post_date}
       onChange ={(event)=> setPostDate(event.target.value)} />
    </Form.Group>

    
    <Form.Group className="mb-3" controlId="formPost_content">
      <Form.Label>Post Content</Form.Label>
      <Form.Control type="text" placeholder="Enter post content" value={post_content}
       onChange ={(event)=> setPostContent(event.target.value)} />
    </Form.Group>

    <Form.Group className="mb-3" controlId="formPost_url">
      <Form.Label>Post Url</Form.Label>
      <Form.Control type="text" placeholder="Enter post url" value={post_url}
       onChange ={(event)=> setPostUrl(event.target.value)} />
    </Form.Group>

    <Form.Group className="mb-3" controlId="formpost_image">
      <Form.Label>Post Image</Form.Label>
      <Form.Control type="text" placeholder="Enter Post Image" value={post_image}
       onChange ={(event)=> setPostImage(event.target.value)} />
    </Form.Group>

    <Form.Group className="mb-3" controlId="post_video">
      <Form.Label>Post Video</Form.Label>
      <Form.Control type="text" placeholder="Enter Post Video" value={post_video}
       onChange ={(event)=> setPostVideo(event.target.value)} />
    </Form.Group>

    <Form.Group className="mb-3" controlId="User_id">
      <Form.Label>User Id</Form.Label>
      <Form.Control type="text" placeholder="Enter User Id" value={User_id}
       onChange ={(event)=> setUserId(event.target.value)} />
    </Form.Group>


    <Button variant="primary" type="submit">
      Submit
    </Button>
  </Form>

  
  )
}

export default PostForm