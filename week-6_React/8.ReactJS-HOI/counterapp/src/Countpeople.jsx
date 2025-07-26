import React from "react";

class CountPeople extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0,
    };
  }

  updateEntry = () => {
    this.setState((prevState) => ({
      entryCount: prevState.entryCount + 1,
    }));
  };

  updateExit = () => {
    this.setState((prevState) => ({
      exitCount: prevState.exitCount + 1,
    }));
  };

  render() {
    return (
      <div style={{ textAlign: "center", marginTop: "50px" }}>
        <h1>Welcome to the WebSite</h1>
        <h2>Number of People Entered: {this.state.entryCount}</h2>
        <h2>Number of People Exited: {this.state.exitCount}</h2>

        <button onClick={this.updateEntry} style={{ margin: "10px", padding: "10px 20px" }}>
          Login
        </button>
        <button onClick={this.updateExit} style={{ padding: "10px 20px" }}>
          Exit
        </button>
      </div>
    );
  }
}

export default CountPeople;
