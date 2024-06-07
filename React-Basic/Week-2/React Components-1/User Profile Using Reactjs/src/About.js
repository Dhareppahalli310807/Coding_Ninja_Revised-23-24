// Create About component here to display the a small content here.
// In this component use paragraph tag (p) to display the content
import React from 'react';
import './styles.css';

class About extends React.Component {
  render() {
    return (
      <div className="about">
        <h2>About Me</h2>
        <p>
          I am a passionate developer with a love for creating dynamic web applications.
          My hobbies include coding, reading tech blogs, and participating in hackathons.
          I have worked on several projects involving front-end and back-end development,
          and I am always eager to learn new technologies and improve my skills.
        </p>
      </div>
    );
  }
}

export default About;
