package com.blrobin2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class League<T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    League(String name) {
        this.name = name;
    }

    boolean add(T team) {
        if (league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
    }

    void showLeagueTable() {
        // Currently unchecked because this version extends Team
        // for some reason instead of Player, which is where
        // the generic code actually lives.
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
