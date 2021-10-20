import React, { Fragment } from 'react'
import { Link } from 'react-router-dom'
import logo from '../img/logo.png'


export const PublicNavbar = () => (
  <Fragment>     
  <nav>   
    <section>
      <Link to="/">Home</Link>
      <Link to="/questions">Questions</Link>
    </section>
  </nav>
  <div className= "logo">  <img src={logo}  alt="logo" /></div>
  
  </Fragment>
)

export const PrivateNavbar = () => (
  <nav>
<img src='/public/img/favicon.png' className="App-logo" alt="logo" />
    <section>
    
      <Link to="/">Home</Link>
      <Link to="/questions">Questions</Link>
      <Link to="/new">New</Link>
      <Link to="/list">List</Link>
    </section>
  </nav>
)
