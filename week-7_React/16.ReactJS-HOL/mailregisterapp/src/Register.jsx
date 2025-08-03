import React, { useState } from 'react';

const Register = () => {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    if (name.length < 5) {
      alert('Full Name must be 5 characters long!');
      return;
    }

    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
      alert('Email is not valid!');
      return;
    }

    if (password.length < 8) {
      alert('Password must be 8 characters long!');
      return;
    }

    alert('Registration Successful!');
  };

  return (
    <div style={{ textAlign: 'center', marginTop: '50px' }}>
      <h1 style={{ color: 'red' }}>Register Here!!!</h1>
      <form onSubmit={handleSubmit}>
        <div style={{ margin: '10px' }}>
          <label>Name: </label>
          <input
            type="text"
            value={name}
            onChange={(e) => setName(e.target.value)}
          />
        </div>
        <div style={{ margin: '10px' }}>
          <label>Email: </label>
          <input
            type="text"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
        </div>
        <div style={{ margin: '10px' }}>
          <label>Password: </label>
          <input
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
        </div>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default Register;
