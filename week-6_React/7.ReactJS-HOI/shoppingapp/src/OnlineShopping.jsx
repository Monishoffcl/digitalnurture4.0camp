import React from "react";
import Cart from "./Cart";

class OnlineShopping extends React.Component {
  render() {
    const items = [
      { itemname: "Laptop", price: "50000" },
      { itemname: "Headphones", price: "2000" },
      { itemname: "Shoes", price: "3000" },
      { itemname: "Mobile", price: "25000" },
      { itemname: "Backpack", price: "1500" }
    ];

    return (
      <div>       
          <h1 style={{ textAlign: "center" }}>Welcome to Online Shopping</h1>
           <div className="table-container">
        <table border="1" cellPadding="10">
          <thead>
            <tr>
              <th>Item Name</th>
              <th>Price (₹)</th>
            </tr>
          </thead>
          <tbody>
            {items.map((item, index) => (
              <Cart key={index} itemname={item.itemname} price={item.price} />
            ))}
          </tbody>
        </table>
        </div>
      </div>
    );
  }
}

export default OnlineShopping;
