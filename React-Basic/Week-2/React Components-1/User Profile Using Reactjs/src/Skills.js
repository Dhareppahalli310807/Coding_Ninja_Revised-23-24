// Create Skill component here to display your skills
// In this component there should be a list with each listitem as your skill.
import React from 'react';
import './styles.css';

class Skills extends React.Component {
  render() {
    return (
      <div className="skills">
        <h2>Technical Skills</h2>
        <ul>
          <li>JavaScript</li>
          <li>React</li>
          <li>HTML</li>
          <li>CSS</li>
          <li>Node.js</li>
        </ul>
      </div>
    );
  }
}

export default Skills;
