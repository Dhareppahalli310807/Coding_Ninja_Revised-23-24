import React from 'react';
import './styles.css';
import Hero from './Hero';
import Skills from './Skills';
import About from './About';

class App extends React.Component {
  render() {
    return (
      <div className="App">
        <Hero />
        <Skills />
        <About />
      </div>
    );
  }
}

export default App;
