import React from "react";
import { MDBContainer, MDBRow, MDBCol, MDBInput, MDBBtn, MDBCard, MDBCardBody, MDBIcon, MDBCardHeader } from "mdbreact";
import { Link } from "react-router-dom";

interface Props {
  
}

// //Typescript
interface State {
  civility: number;
  firstName: string;
  lastName: string;
  email: string;
  password: string;
  // user: object;
  // userIsDefined: boolean;
}

class Register extends React.Component <Props, State> {

  state: {
  civility: number;
  firstName: string;
  lastName: string;
  email: string;
  password: string;
  // user: object;
  // userIsDefined: boolean;
  }

  constructor(props) {
    super(props);

    this.state = {
      civility: 0,
      firstName:"", 
      lastName:"",
      email:"",
      password:"",
      // user: {},
      // userIsDefined: false
    };
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleSubmit = event =>{
    event.preventDefault();
    

this.state.civility = document.getElementById("civility1").value;
this.state.firstName = document.getElementById("firstName").value;
this.state.lastName = document.getElementById("lastName").value;
this.state.email = document.getElementById("email").value;
this.state.password = document.getElementById("password").value;

  alert('Le nom a été soumis : ' + this.state.lastName + ' email : ' + this.state.email + ' civility : ' + this.state.civility );

  const url ="http://localhost:8080/account/add";

  const headers = new Headers({
    "Accept": "application/json",
  "Content-Type": "application/json"});


  fetch(url, { 

      method: "POST", 
      headers,
      body: JSON.stringify( { 
        
        firstName: this.state.firstName,
        lastName: this.state.lastName,
        login: this.state.email,
        password: this.state.password,
        civilityId: "1",
        roleId: "1"
      } )
  })
//   .then(data => {
//     data.json().then(results => {
//       this.setState({
//         user: results[0],
//         userIsDefined: true
//       });

//       window.localStorage.setItem("user", results[0]);
//     });
//   });
// }
// setState(arg0: { user: any; userIsDefined: boolean; }) {
//   throw new Error("Method not implemented.");
// }
  
  .then(response => response.json())
  .then((data) =>  console.log(data))
  .catch((err)=>console.log(err));
}


    render() {
  return (
    <React.Fragment>
    <section className="my-5">
    <MDBContainer>
      <MDBRow>
        <MDBCol md="12">
          <MDBCard>
            <MDBCardBody>
            <MDBCardHeader className="form-header deep-blue-gradient rounded">
                <h3 className="my-3">
                  <MDBIcon icon="lock" /> Créer un compte :
                </h3>
              </MDBCardHeader>
              <form className="my-5" onSubmit={this.handleSubmit}>

              <div>
        <select className="browser-default custom-select">
          <option>Choisissez une civilité</option>
          <option value="1" id="civility1">Monsieur</option>
          <option value="2" id="civility2">Madame</option>
        </select>
      </div>
                
                <div className="grey-text">
                  <MDBInput
                    label="Votre prénom"
                    icon="user"
                    group
                    type="text"
                    id="lastName"
                    validate
                    error="wrong"
                    success="right"
                  />
                  <MDBInput
                    label="Votre nom"
                    icon="user"
                    group
                    type="text"
                    id="firstName"
                    validate
                    error="wrong"
                    success="right"
                  />
                  <MDBInput
                    label="Votre email"
                    icon="envelope"
                    group
                    type="email"
                    validate
                    error="wrong"
                    success="right"
                  />
                  <MDBInput
                    label="Confirmez votre email"
                    icon="exclamation-triangle"
                    group
                    type="text"
                    id="email"
                    validate
                    error="wrong"
                    success="right"
                    // style="display: none;"
                    // className="form-control"
                    autocomplete="username email" 
                  />
                  <MDBInput
                    label="Votre mot de passe"
                    icon="lock"
                    group
                    type="password"
                    id="password"
                    validate
                    autocomplete="new-password"
                    required
                    className="form-control"
                    minlength="6"
                    maxlength="15"
                  />
                </div>
                <div className="text-center py-4 mt-3">
                  <MDBBtn color="light-blue" type="submit" className="font-weight-bold">
                    Register
                  </MDBBtn>
                </div>
              </form>
              <Link to="/login" className="white-text z-depth-3">
                <MDBBtn gradient="blue" className="rounded-pill font-weight-bold ">
                  <MDBIcon  icon='mouse-pointer' className='left' />  Vous avez déjà un compte ? Cliquez ici
                </MDBBtn>
                </Link>
            </MDBCardBody>
          </MDBCard>
        </MDBCol>
      </MDBRow>
    </MDBContainer>
    </section>
    </React.Fragment>
  );
}
}

export default Register;