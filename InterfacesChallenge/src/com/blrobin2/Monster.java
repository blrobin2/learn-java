package com.blrobin2;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Saveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, name);
        values.add(1, ""+hitPoints);
        values.add(2, ""+strength);
        return values;
    }

    @Override
    public void read(List<String> saveValues) {
        if (saveValues != null && saveValues.size() > 0) {
            name = saveValues.get(0);
            hitPoints = Integer.parseInt(saveValues.get(1));
            strength = Integer.parseInt(saveValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" + "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}