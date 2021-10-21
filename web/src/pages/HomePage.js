import React, { Fragment } from 'react'
import { Link } from 'react-router-dom'



const HomePage = ({children}) => (
  <Fragment> 
  <section>    
    <h1>Home</h1>
    <div>
      {children}
    </div>
    <p>welcome to the question and answer app.</p>
    <div clasName ="homecenter">    
    </div>  
  </section>  
  </Fragment>

)
export default HomePage
