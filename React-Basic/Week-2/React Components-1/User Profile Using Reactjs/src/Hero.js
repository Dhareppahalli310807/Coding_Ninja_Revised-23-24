import React from 'react';
import './styles.css';

class Hero extends React.Component {
  render() {
    return (
      <div className="hero">
        <h2>Basic Information</h2>
        <p>Name: John Doe</p>
        <p>Email: john.doe@example.com</p>
        <p>Phone: 123-456-7890</p>
        <p>Address: 123 Main St, Anytown, USA</p>
      </div>
    );
  }
}

export default Hero;
