import React from 'react';

const Navbar = () => {
  return (
    <div className="bg-transparent py-4">
      <h1 className="text-center text-4xl text-black font-bold">
        Welcome to the Tank WebService in Java
      </h1>
      <ul className="flex justify-center gap-6 mt-4 text-lg text-blue-800 font-semibold">
        <li><a href="/">Add Tank</a></li>
        <li><a href="/">Delete Tank</a></li>
        <li><a href="/">Review Table</a></li>
      </ul>
    </div>
  );
};

export default Navbar;
