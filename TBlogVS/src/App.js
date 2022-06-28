  import { Container, Nav, Navbar } from 'react-bootstrap';
import { BrowserRouter, Route, Routes, Link } from 'react-router-dom';
  import './App.css';
  import AllPosts from './components/AllPosts';
  //import Counter from './components/Counter'
import PostDetail from './components/PostDetail';
  import Welcome from './components/Welcome';
  import Log from './assets/log.png';
  import NavDropdown from 'react-bootstrap/NavDropdown';


  function App() {
    

    return (
      <BrowserRouter>
  <Navbar bg="dark" variant="dark" expand="lg">
        <Container>
          <Navbar.Brand href="#home">
          <img
            src={Log}
              width="150"
              height="150"
              className="d-inline-block align-top"
              alt="T2T"
            />
            <div class="container-fluid"/>
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Trek To Tech</a>
    </div>
          </Navbar.Brand>
          {/* <Navbar.Brand href="#home">React App with Router</Navbar.Brand> */}
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              <Nav.Link as={Link} to="/">All Posts</Nav.Link>
              <NavDropdown title="Post Options" id="navbarScrollingDropdown">
              <NavDropdown.Item href="#action1">Create Post</NavDropdown.Item>
              <NavDropdown.Item href="#action2">Edit Post</NavDropdown.Item>
              <NavDropdown.Item href="#action3">Delete Post</NavDropdown.Item>
            </NavDropdown>
              <Nav.Link as={Link} to="/welcome">About Us</Nav.Link>
              {/* <Nav.Link as={Link} to="/counter">Counter</Nav.Link> */}
            </Nav>
            <form class="navbar-form navbar-left" action="/action_page.php">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search"/>
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
    </form>
          </Navbar.Collapse>
        </Container>
      </Navbar>
      
          <Routes>
            <Route path='/' element={<AllPosts/>} />
            <Route path='/welcome' element={<Welcome/>} />
            {/* <Route path='/counter' element={<Counter/>} /> */}
            <Route path='/post/:id' element={<PostDetail/>} />
            </Routes>    
      </BrowserRouter>
    );
  }

  export default App;
