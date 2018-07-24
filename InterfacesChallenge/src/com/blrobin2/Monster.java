package com.blrobin2;

import java.util.ArrayList;

public class Monster implements Saveable {
    private ArrayList stats;

    @Override
    public ArrayList get() {
        return stats;
    }

    @Override
    public void set(ArrayList fields) {
        this.stats = fields;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Monster:");
        for (Object stat : stats) {
            stringBuilder.append(" -- ").append(stat.toString());
        }
        return stringBuilder.toString();
    }
}
