import './App.css';

import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <h1>Score Calculator App</h1>
      <CalculateScore name="Rahul" school="ABC Public School" total={450} goal={5} />
    </div>
  );
}

export default App;
