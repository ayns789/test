
import React from "react";
import { MDBNavbar, MDBNavbarBrand, MDBNavbarNav, MDBNavbarToggler, MDBCollapse, MDBNavItem,  MDBContainer, MDBMask, MDBView, MDBDropdown, MDBDropdownToggle, MDBIcon, MDBDropdownMenu, MDBDropdownItem } from "mdbreact";
import {  Link } from "react-router-dom";
import "../../less/components/navbar.less";
// MDBNavLink,

class FullPageIntroWithFixedNavbar extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      collapse: false,
      isWideEnough: false
    };
    this.onClick = this.onClick.bind(this);
  }

  // setState: any;

  onClick() {
    this.setState({
      collapse: !this.state.collapse
    });
  }

//   réglage position onglets :
//   className="white-text mr-4  pt-6 pb-6">

// couleurs sympa de navbar :
// indigo, peach-gradient, purple-gradient, aqua-gradient, blue-gradient

  render() {
    return (
      <div>
        <header>
          {/* couleur favorite: winter-neva-gradient */}
            <MDBNavbar color="blue-gradient" dark expand="md" fixed="top">
              <MDBNavbarBrand href="/">
              <img src="https://i.ibb.co/5WzzW03/logo2.png" className="img-fluid" height="50" width="50" alt="logo" id="logo"/>
              {/* height="50" width="50"  */}
              {/* <img src="https://i.ibb.co/5WzzW03/logo2.png" alt="logo2" border="0"></img> */}
              </MDBNavbarBrand>
              {!this.state.isWideEnough && <MDBNavbarToggler onClick={this.toggleCollapse} />}
              {/* ou pour réglage menu hamburger :
               <MDBHamburgerToggler color="black" id="hamburger1" onClick={()=> this.toggleSingleCollapse('collapse1')} /> */}
              <MDBCollapse isOpen={this.state.collapse} navbar>
                <MDBNavbarNav left className=" font-weight-bold text-monospace text-uppercase lead">
                  <MDBNavItem active>
                    <Link to="/" className="white-text mr-5 pt-6 pb-6" ><strong>Accueil</strong></Link>
                  </MDBNavItem>
                  <MDBNavItem>
                    <Link to="/sejours" className="white-text mr-5 pt-6 pb-6"><strong>Séjours</strong></Link>
                  </MDBNavItem>
                  <MDBNavItem>
                    <Link to="/services" className="white-text mr-5 pt-6 pb-6"><strong>Services</strong></Link>
                  </MDBNavItem>
                  <MDBNavItem>
                    <Link to="/activites" className="white-text mr-5 pt-6 pb-6"><strong>Activités</strong></Link>
                  </MDBNavItem>
                  <MDBNavItem>
                    <Link to="/contact" className="white-text mr-5 pt-6 pb-6"><strong>Contact</strong></Link>
                  </MDBNavItem>
                  </MDBNavbarNav>
                  <MDBNavbarNav right>
                  <MDBNavItem>
               <MDBDropdown>
                 <MDBDropdownToggle nav caret>
                   <MDBIcon icon="user" />
                 </MDBDropdownToggle>
                 <MDBDropdownMenu className="dropdown-default">
                 <MDBDropdownItem><Link to="/login" className="dark-text center-text text-uppercase"><strong>Mon compte</strong></Link></MDBDropdownItem>
                   <MDBDropdownItem><Link to="/espamembre" className="dark-text center-text text-uppercase"><strong>Espace membre</strong></Link></MDBDropdownItem>
                 </MDBDropdownMenu>
               </MDBDropdown>
             </MDBNavItem>
                </MDBNavbarNav>
              </MDBCollapse>
            </MDBNavbar>
        </header>
      </div>
    );
  }
}

export default FullPageIntroWithFixedNavbar;
