import { Component } from "react";
import { Todo } from "./Todo";

export class List extends Component {
  render() {
    return (
      <div className="list">
        {/* Render the todos here from the props*/}
        {this.props.todos.map((todo, index) => (
          <Todo
            key={index}
            todo={todo}
            handleRemove={() => this.props.handleRemove(index)}
          />
        ))}
      </div>
    );
  }
}
