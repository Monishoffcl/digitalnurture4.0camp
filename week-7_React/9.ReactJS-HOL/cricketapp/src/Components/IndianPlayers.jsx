import React from 'react';

const IndianPlayers = () => {
  const oddTeam = ['Virat', 'Dhoni', 'Jadeja', 'KL Rahul', 'Chahal'];
  const evenTeam = ['Rohit', 'Pant', 'Bumrah', 'Ashwin', 'Gill', 'Hardik'];

  const [odd1, odd2, ...restOdd] = oddTeam;
  const [even1, even2, ...restEven] = evenTeam;

  const T20players = ['Surya', 'Ishan', 'Arshdeep'];
  const RanjiTrophy = ['Pujara', 'Rahane'];

  const mergedPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Team Players:</h2>
      <ul>
        <li>{odd1}</li>
        <li>{odd2}</li>
        {restOdd.map((player, i) => <li key={i}>{player}</li>)}
      </ul>

      <h2>Even Team Players:</h2>
      <ul>
        <li>{even1}</li>
        <li>{even2}</li>
        {restEven.map((player, i) => <li key={i}>{player}</li>)}
      </ul>

      <h3>Merged T20 and Ranji Players:</h3>
      <ul>
        {mergedPlayers.map((player, i) => <li key={i}>{player}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
