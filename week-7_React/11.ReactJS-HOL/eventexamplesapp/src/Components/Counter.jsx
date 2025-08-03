import React, { Component } from 'react';

class Counter extends Component {
  constructor() {
    super();
    this.state = {
      count: 0,
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
  };

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  sayHello = () => {
    console.log("Hello! Welcome to the counter app.");
  };

  handleIncrement = () => {
    this.increment();
    this.sayHello();
  };

  render() {
    return (
      <div>
        <h2>Counter Value: {this.state.count}</h2>
        <button onClick={this.handleIncrement}>Increment</button>{' '}
        <button onClick={this.decrement}>Decrement</button>
      </div>
    );
  }
}

export default Counter;
