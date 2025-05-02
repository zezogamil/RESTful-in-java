package com.example.wsrest;

public class Tank {
    private String name;
    private String country;
    private double gunCaliber;
    private int frontArmor;
    private int speed;
    private int crewCapcity;

    public Tank() {}
    public Tank(String name, String country, double gunCaliber, int frontArmor, int
                speed, int crewCapcity) {
        this.name = name;
        this.country = country;
        this.gunCaliber = gunCaliber;
        this.frontArmor = frontArmor;
        this.speed = speed;
        this.crewCapcity = crewCapcity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getGunCaliber() {
        return gunCaliber;
    }

    public void setGunCaliber(double gunCaliber) {
        this.gunCaliber = gunCaliber;
    }

    public int getFrontArmor() {
        return frontArmor;
    }

    public void setFrontArmor(int frontArmor) {
        this.frontArmor = frontArmor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCrewCapcity() {
        return crewCapcity;
    }

    public void setCrewCapcity(int crewCapcity) {
        this.crewCapcity = crewCapcity;
    }
}
