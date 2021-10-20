import React, { Fragment } from 'react'

function Footer() {
    return (
        <Fragment>
<footer className= "footer text-center text-lg-start bg-black text-muted">
  <section class="d-flex justify-content-center justify-content-lg-between p-4 border-bottom">    
    <div class="me-5 d-none d-lg-block">
      <span>Daniela Vargas Mendoza </span>
    </div>
  
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
      <a href="" class="me-4 text-reset">
        <i class="fab fa-linkedin"></i>
      </a>
      <a href="" class="me-4 text-reset">
        <i class="fab fa-github"></i>
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
            Nuestra pagina esta diseñara para realizar preguntas y responder sobre toda clase de questionarios
          </p>
        </div>        
        <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">         
          <h6 class="text-uppercase fw-bold mb-4">
            Training
          </h6>
          <p>
            <a href="#!" class="text-reset">Desarrollo</a>
          </p>
          <p>
            <a href="#!" class="text-reset">Scrum</a>
          </p>
          <p>
            <a href="#!" class="text-reset">Q&A</a>
          </p>
          
        </div>       
        
        <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">    
          <h6 class="text-uppercase fw-bold mb-4">
            Contacto
          </h6>
          <p><i class="fas fa-home me-3"></i> Medellin</p>
          <p>
            <i class="fas fa-envelope me-3"></i>
           SofkaU
          </p>
          <p><i class="fas fa-phone me-3"></i> + 1234</p>         
        </div>      
      </div>     
    </div>
  </section>  
  
</footer> 
         </Fragment>

    )
}

export default Footer
