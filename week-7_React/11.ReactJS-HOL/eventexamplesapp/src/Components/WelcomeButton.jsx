import React from 'react';

const WelcomeButton = () => {
  const greet = (msg) => {
    alert(`Message: ${msg}`);
  };

  return (
    <div>
      <button onClick={() => greet('Welcome')}>Say Welcome</button>
    </div>
  );
};

export default WelcomeButton;
