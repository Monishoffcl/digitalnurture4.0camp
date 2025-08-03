import React from 'react';

const SyntheticClick = () => {
  const handleClick = (event) => {
    alert("I was clicked");
    console.log("Synthetic event object:", event);
  };

  return (
    <div>
      <button onClick={handleClick}>Click Me (Synthetic Event)</button>
    </div>
  );
};

export default SyntheticClick;
