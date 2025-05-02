'use client';
import React, { useEffect, useState } from 'react';

const TankList = () => {
  const [tanks, setTanks] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8080/WebServiceRS/api/tanks')
      .then((res) => res.json())
      .then((data) => setTanks(data))
      .catch((err) => console.error("Failed to fetch tanks:", err));
  }, []);

  return (
    <div>
      <h2 className="text-2xl font-semibold mb-4 text-black">Available Tanks</h2>
      <table className="min-w-full border border-gray-300">
        <thead className="bg-gray-200">
          <tr>
            <th className="border px-4 py-2 text-black">Name</th>
            <th className="border px-4 py-2 text-black">Country</th>
            <th className="border px-4 py-2 text-black">Gun Caliber</th>
            <th className="border px-4 py-2 text-black">Front Armor</th>
            <th className="border px-4 py-2 text-black">Speed</th>
            <th className="border px-4 py-2 text-black">Crew</th>
          </tr>
        </thead>
        <tbody>
          {tanks.map((tank, index) => (
            <tr key={index} className="text-center">
              <td className="border px-4 py-2 text-black">{tank.name}</td>
              <td className="border px-4 py-2 text-black">{tank.country}</td>
              <td className="border px-4 py-2 text-black">{tank.gunCaliber}</td>
              <td className="border px-4 py-2 text-black">{tank.frontArmor}</td>
              <td className="border px-4 py-2 text-black">{tank.speed}</td>
              <td className="border px-4 py-2 text-black">{tank.crewCapcity}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default TankList;
