function BookDetails() {
  const books = [
    { title: "Master React", price: 670 },
    { title: "Deep Dive into Angular 11", price: 800 },
    { title: "Mongo Essentials", price: 450 },
  ];

  return (
    <div className="section">
      <h2>Book Details</h2>
      {books.map((book, index) => (
        <div key={index}>
          <h4>{book.title}</h4>
          <p>{book.price}</p>
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
