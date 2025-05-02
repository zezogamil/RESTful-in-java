import Image from "next/image";
import LandingPage from "./components/LandingPage";
import TankList from "./components/TankList";

export default function Home() {
  return (
    <div className="">
      <LandingPage />
      <TankList />
    </div>
  );
}
