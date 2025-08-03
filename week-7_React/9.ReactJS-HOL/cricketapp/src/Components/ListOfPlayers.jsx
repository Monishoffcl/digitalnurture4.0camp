import React from 'react';

const players = [
  { name: 'Virat', score: 88 },
  { name: 'Rohit', score: 65 },
  { name: 'Bumrah', score: 72 },
  { name: 'Dhoni', score: 91 },
  { name: 'Jadeja', score: 69 },
  { name: 'Pant', score: 77 },
  { name: 'KL Rahul', score: 85 },
  { name: 'Ashwin', score: 45 },
  { name: 'Gill', score: 74 },
  { name: 'Hardik', score: 52 },
  { name: 'Chahal', score: 66 },
];

const ListofPlayers = () => {
  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players:</h2>
      <ul>
        {players.map((player, i) => (
          <li key={i}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h3>Players with score below 70:</h3>
      <ul>
        {filteredPlayers.map((player, i) => (
          <li key={i}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
