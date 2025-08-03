import React from 'react';
import ListofPlayers from './Components/ListOfPlayers';
import IndianPlayers from './Components/IndianPlayers';

function App() {
  const flag = false; 

  return (
    <div className="App">
      <h1>🏏 Welcome to Cricket App</h1>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
