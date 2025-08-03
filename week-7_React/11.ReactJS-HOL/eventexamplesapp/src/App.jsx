import React from 'react';
import Counter from './Components/Counter';
import WelcomeButton from './Components/WelcomeButton';
import SyntheticClick from './Components/SyntheticClick';
import CurrencyConvertor from './Components/CurrencyConverter';

function App() {
  return (
    <div style={{ padding: '20px' }}>
      <h1>🚀 React Event Examples App</h1>
      <Counter />
      <WelcomeButton />
      <SyntheticClick />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
