import { Component } from "react";
import { instructors } from "../data";
import { Container, Button } from "../resuable.styled";

class Sidebar extends Component {
  render() {
    return (
      <Container flex="1">
        {instructors.map((instructor) => (
          <div key={instructor.id} className="instructor">
            <img src={instructor.image} alt={instructor.name} />
            <h4>{instructor.name}</h4>
            <Button bg="blue">Follow</Button>
          </div>
        ))}
      </Container>
    );
  }
}

export default Sidebar;
