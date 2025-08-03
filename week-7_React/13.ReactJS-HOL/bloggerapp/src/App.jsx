import React from 'react';
import CourseDetails from './Components/CourseDetails';
import BookDetails from './Components/BookDetails';
import BlogDetails from './Components/BlogDetails';
import './App.css';

function App() {
  return (
    <div className="app-container">
      <CourseDetails />
      <BookDetails />
      <BlogDetails />
    </div>
  );
}

export default App;
