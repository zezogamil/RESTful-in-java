import React from 'react';
import Navbar from './Navbar';
import TankList from './TankList'; // ✅ Import it

const LandingPage = () => {
  return (
    <div
      className="
        bg-cover bg-center bg-no-repeat
        w-screen min-h-screen
        flex flex-col items-center justify-start"
      style={{ backgroundImage: "url('/wallpaper.jpg')" }}
    >
      <div className="absolute top-0 left-0 w-full z-10 text-center">
        <Navbar />
      </div>

      <div className="z-20 mt-32 bg-white bg-opacity-90 p-6 rounded-lg shadow-lg w-4/5">
        <TankList /> {/* ✅ Render it here */}
      </div>
    </div>
  );
};

export default LandingPage;
