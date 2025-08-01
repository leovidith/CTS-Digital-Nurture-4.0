import React from 'react';
import FlightDetails from './FlightDetails';

function UserPage() {
  return (
    <div>
      <h2>Welcome, User!</h2>
      <p>You can now book your tickets below.</p>
      <FlightDetails />
      <button>Book Now</button>
    </div>
  );
}

export default UserPage;
