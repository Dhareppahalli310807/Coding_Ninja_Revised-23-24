import { Component } from "react";

class Person extends Component {
  // Define appropriate lifecycle method to show alert here
  componentWillUnmount() {
    alert(`${this.props.person.email} has been removed.`);
  }

  render() {
    const { img, email } = this.props.person;
    const { removePerson, index } = this.props;
    return (
      <div className="person">
        <b onClick={() => removePerson(index)}>X</b>
        <img alt={email} src={img} />
        <p>{email}</p>
      </div>
    );
  }
}

export default Person;
