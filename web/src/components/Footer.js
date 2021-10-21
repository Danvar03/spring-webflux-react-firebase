import React, { Fragment } from "react";

function Footer() {
  return (
    <Fragment>
      <footer className="footer text-center text-lg-start bg-black text-muted">
        <section class="d-flex justify-content-center justify-content-lg-between p-4 border-bottom">
          <div class="me-5 d-none d-lg-block"></div>
          <img src="https://www.sofka.com.co/wp-content/uploads/2021/02/sofkau-logo-horizontal.png"/>
          <div>
            <a href="" class="me-4 text-reset">
              <i class="fab fa-facebook-f"></i>
            </a>
            <a href="" class="me-4 text-reset">
              <i class="fab fa-twitter"></i>
            </a>
            <a href="" class="me-4 text-reset">
              <i class="fab fa-google"></i>
            </a>
            <a href="" class="me-4 text-reset">
              <i class="fab fa-instagram"></i>
            </a>
        
          </div>
        </section>
    
     

        <section class="">
          <div class="container text-center text-md-start mt-5">
            <div class="row mt-3">
              <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
                <h6 class="text-uppercase fw-bold mb-5">
                  <i class="fas fa-gem me-3"></i>SOFKAU
                </h6>
                <p>
                  Nuestra pagina esta diseñara para realizar preguntas y
                  responder sobre toda clase de questionarios
                </p>
              </div>
              <div className="col-md-4">
                <img
                  className="rounded-circle"
                  src="https://image.flaticon.com/icons/png/512/219/219990.png"
                  alt=""
                  width={"140"}
                  height={"140"}
                />
                <h2>Daniela Vargas.</h2>
                <p>Full stack</p>
              </div>
            </div>
          </div>
        </section>
      </footer>
    </Fragment>
  );
}
export default Footer;
