import React, { Fragment } from "react";
import { Link } from "react-router-dom";
import logo from "../img/logo.png";



export const PublicNavbar = () => (
  <Fragment>
    <nav>
      <section>
        <Link className="nav-item mr-3 btn btn-outline-light px-4" to="/">
          Home <i className="bi bi-house" />
        </Link>
        <Link
          className="nav-item mr-3 btn btn-outline-light px-4"
          to="/questions"
        >
          Questions
        </Link>
        <Link
          className="nav-item mr-3 btn btn-outline-light px-4"
          to={"/login"}
        >
          Log In <i className="bi bi-box-arrow-right" />
        </Link>
      </section>
    </nav>
    <div className="logo">
      {" "}
      <img src={logo} alt="logo" />
    </div>
  </Fragment>
);

export const PrivateNavbar = () => (
  <Fragment>
    <nav>
      <section>
        <Link className="nav-item mr-3 btn btn-outline-light px-4" to="/">
          Home
        </Link>
        <Link
          className="nav-item mr-3 btn btn-outline-light px-4"
          to="/questions"
        >
          Questions
        </Link>
        <Link className="nav-item mr-3 btn btn-outline-light px-4" to="/new">
          New
        </Link>
        <Link className="nav-item mr-3 btn btn-outline-light px-4" to="/list">
          List
        </Link>
      </section>
    </nav>
    <div className="logo">
      {" "}
      <img src={logo} alt="logo" />
    </div>
  </Fragment>
);
