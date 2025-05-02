package com.example.wsrest;

import java.util.*;
public class TankService {
    private static Map<String, Tank> tanks = new HashMap<>();


    static {
        tanks.put("Tiger", new Tank("Tiger", "Germany", 88.0, 100, 40, 5));
        tanks.put("Sherman", new Tank("Sherman", "USA", 75.0, 50, 48, 5));
        tanks.put("Leopard", new Tank("Leopard", "Germany", 120.0, 80, 70, 4));
    }

    public List<Tank> getAll() {
        return new ArrayList<>(tanks.values());
    }

    public Tank get(String name) {
        return tanks.get(name);
    }

    public void add(Tank tank){
        tanks.put(tank.getName(), tank);
    }

    public void update(String name, Tank tank) {
        tanks.put(name, tank);
    }

    public void delete(String name){
        tanks.remove(name);
    }


}
