import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor() {
    super();
    this.state = {
      amount: '',
      conversionType: 'INRtoEUR',
    };
  }

  handleAmountChange = (e) => {
    this.setState({ amount: e.target.value });
  };

  handleTypeChange = (e) => {
    this.setState({ conversionType: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const { amount, conversionType } = this.state;
    const rate = 90; // 1 Euro = 90 INR

    if (!amount || isNaN(amount)) {
      alert("Please enter a valid number.");
      return;
    }

    let result = 0;
    let message = '';

    if (conversionType === 'INRtoEUR') {
      result = (parseFloat(amount) / rate).toFixed(2);
      message = `₹${amount} INR = €${result} EUR`;
    } else {
      result = (parseFloat(amount) * rate).toFixed(2);
      message = `€${amount} EUR = ₹${result} INR`;
    }

    alert(`Converted Amount:\n${message}`);
  };

  render() {
    return (
      <div style={{ marginTop: '30px' }}>
        <h2>Currency Converter</h2>
        <form onSubmit={this.handleSubmit}>
          <label>
            Amount:
            <input
              type="number"
              value={this.state.amount}
              onChange={this.handleAmountChange}
              placeholder="Enter amount"
              required
              style={{ marginLeft: '10px' }}
            />
          </label>
          <br /><br />
          <label>
            Conversion Type:
            <select
              value={this.state.conversionType}
              onChange={this.handleTypeChange}
              style={{ marginLeft: '10px' }}
            >
              <option value="INRtoEUR">INR ➡ EUR</option>
              <option value="EURtoINR">EUR ➡ INR</option>
            </select>
          </label>
          <br /><br />
          <button type="submit">Convert</button>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;
