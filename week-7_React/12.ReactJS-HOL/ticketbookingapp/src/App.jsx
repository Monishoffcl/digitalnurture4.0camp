import React, { useState } from 'react';
import GuestPage from './Components/GuestPage';
import UserPage from './Components/UserPage';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  let pageContent;

  if (isLoggedIn) {
    pageContent = <UserPage />;
  } else {
    pageContent = <GuestPage />;
  }

  const toggleLogin = () => {
    setIsLoggedIn(prev => !prev);
  };

  return (
    <div style={{ textAlign: 'center' }}>
      <h1>Ticket Booking App</h1>
      <button onClick={toggleLogin}>
        {isLoggedIn ? 'Logout' : 'Login'}
      </button>
      {pageContent}
    </div>
  );
}

export default App;
