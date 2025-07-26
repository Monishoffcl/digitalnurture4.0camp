import React from "react";

class Cart extends React.Component {
  static defaultProps = {
    itemname: "Unknown Item",
    price: "0.00"
  };

  render() {
    return (
      <tr>
        <td>{this.props.itemname}</td>
        <td>{this.props.price}</td>
      </tr>
    );
  }
}

export default Cart;

