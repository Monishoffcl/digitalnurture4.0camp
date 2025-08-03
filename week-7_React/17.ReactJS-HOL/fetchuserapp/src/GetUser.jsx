import React, { Component } from 'react';

class Getuser extends Component {
  constructor() {
    super();
    this.state = {
      name: '',
      picture: '',
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch('https://api.randomuser.me/');
      const data = await response.json();
      const user = data.results[0];

      this.setState({
        name: `${user.name.title} ${user.name.first} ${user.name.last}`,
        picture: user.picture.large,
      });
    } catch (error) {
      console.error("Error fetching user data:", error);
    }
  }

  render() {
    return (
      <div style={{ textAlign: 'center', marginTop: '50px' }}>
        <h1>{this.state.name}</h1>
        <img src={this.state.picture} alt="User" />
      </div>
    );
  }
}

export default Getuser;
