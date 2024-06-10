import React from 'react';
import './styles.css';

export default function App() {
  const formStyle = {
    display: 'flex',
    flexDirection: 'column',
    justifyContent: 'center',
    alignItems: 'center',
    gap: '1rem',
    margin: 'auto',
    width: '250px',
    height: '225px',
    padding: '2rem'
  };

  const formInputStyle = {
    width: '100%',
    paddingBlock: '0.5rem',
    border: '1px solid black',
    borderRadius: '5px'
  };

  const submitBtnStyle = {
    width: '100%',
    backgroundColor: 'black',
    color: 'white',
    paddingBlock: '0.5rem',
    fontSize: '1.035rem',
    border: 'none',
    borderRadius: '5px',
    cursor: 'pointer'
  };

  return (
    <div className="App">
      <form style={formStyle}>
        <h1>Register Form</h1>
        <input type="text" placeholder="Name" style={formInputStyle} />
        <input type="email" placeholder="Email" style={formInputStyle} />
        <input type="password" placeholder="Password" style={formInputStyle} />
        <button type="submit" style={submitBtnStyle}>Submit</button>
      </form>
    </div>
  );
}
