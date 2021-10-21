import React, { Component } from "react";
import {signInWithGoogle, signup} from "../config/auth";


export default class Register extends Component {
    constructor(props) {
        super(props);
        this.state = {
          error: null,
          email: "",
          password: "",
        };
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
       
      }
      handleChange(event) {
        this.setState({
          [event.target.name]: event.target.value,
        });
      }

      async handleSubmit(event) {
        event.preventDefault();
        this.setState({ error: "" });
        try {
          await signup(this.state.email, this.state.password);
        } catch (error) {
          this.setState({ error: error.message });
        }
      }

    async googleSignIn() {
    try {
      await signInWithGoogle();
    } catch (error) {
      
      this.setState({ error: error.message });
    }
  }
  
  render() {
    return (
      <div className="home-app">
        <form form className="mt-5 py-5 px-5" onSubmit={this.handleSubmit}>
          <h1>
          Registrar Sesión
            
          </h1>
          <p className="lead">
            Complete el siguiente formulario para iniciar sesión en su cuenta.
          </p>
          <div className="form-group container-input">
            <input
              className="form-control"
              placeholder="Email"
              name="email"
              type="email"
              onChange={this.handleChange}
              value={this.state.email}
            />
            <input
              className="form-control"
              placeholder="Password"
              name="password"
              type="password"
              onChange={this.handleChange}
              value={this.state.password}
            />
          </div>

          {this.state.error ? <p>{this.state.error}</p> : null}
            <button className="boton-cerrar" type="submit">Registrar Email</button>            
          <hr />         
        </form>
      </div>
    );
  }
}
