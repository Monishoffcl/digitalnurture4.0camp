import React from 'react';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import Home from './Home';
import TrainerList from './TrainerList';
import TrainerDetail from './TrainersDetails';
import trainers from './TrainersMock';

function App() {
  return (
    <BrowserRouter>
      <div>
        <nav>
          <Link to="/">Home</Link> | <Link to="/trainers">Trainers</Link>
        </nav>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/trainers" element={<TrainerList trainers={trainers} />} />
          <Route path="/trainers/:id" element={<TrainerDetail />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}

export default App;
