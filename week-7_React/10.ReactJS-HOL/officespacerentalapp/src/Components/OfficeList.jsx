import React from 'react';

const officeSpaces = [
  {
    name: 'Tech Park One',
    rent: 75000,
    address: 'Baner, Pune',
    image: 'https://jll-global-gdim-res.cloudinary.com/image/upload/f_avif,dpr_auto,w_1920,q_auto/v1505556824/IN_ML20170916/Tech-Park-One---Tower-D_7631_20170916_001.jpg'
  },
  {
    name: 'Innovative Tower',
    rent: 58000,
    address: 'Koramangala, Bangalore',
    image: 'https://www.australiandesignreview.com/wp-content/uploads/2014/07/Jockey-Club-Innovation-Tower2.jpg'
  },
  {
    name: 'Startup Hub',
    rent: 62000,
    address: 'Hitech City, Hyderabad',
    image: 'https://images.moneycontrol.com/static-mcnews/2022/06/T-Hub-Hyderabad_Twitter-770x435.jpg?impolicy=website&width=1280&height=720'
  },
];


const OfficeList = () => {
  return (
    <div>
      {officeSpaces.map((office, index) => (
        <div key={index} style={{ border: '1px solid gray', padding: '15px', marginBottom: '15px' }}>
          <h2>{office.name}</h2>
          <img src={office.image} alt={office.name} width="300" height="200" />
          <p><strong>Address:</strong> {office.address}</p>
          <p>
            <strong>Rent:</strong>{' '}
            <span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
              ₹{office.rent}
            </span>
          </p>
        </div>
      ))}
    </div>
  );
};

export default OfficeList;
