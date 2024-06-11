import React from "react";

export default class Name extends React.Component {
  constructor() {
    super();
    this.state = {
      fullName: "Coding Ninjas",
      curIndex: 0,
      currentName: ""
    };
  }

  // This function adds a character to the string.
  typeWriterEffect = () => {
    this.setState((prevState) => {
      if (prevState.curIndex < prevState.fullName.length) {
        return {
          curIndex: prevState.curIndex + 1,
          currentName: prevState.fullName.substring(0, prevState.curIndex + 1)
        };
      } else {
        clearInterval(this.intervalId);
        return null;
      }
    });
  };

  componentDidUpdate(prevProps) {
    if (this.props.showName && !prevProps.showName) {
      this.intervalId = setInterval(this.typeWriterEffect, 500);
    } else if (!this.props.showName && prevProps.showName) {
      clearInterval(this.intervalId);
      this.setState({ curIndex: 0, currentName: "" });
    }
  }

  componentWillUnmount() {
    clearInterval(this.intervalId);
  }

  // Required lifecycle methods here

  render() {
    return <h1>{this.state.currentName}</h1>;
  }
}
