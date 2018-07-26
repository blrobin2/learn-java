package com.blrobin2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class League<T extends Player> {
    private String name;
    private List<Team<T>> teams;

    League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    boolean addTeam(Team<T> team) {
        if (teams.contains(team)) {
            return false;
        }
        teams.add(team);
        return true;
    }

    void printRankings() {
        Collections.sort(teams);
        System.out.println(name + " Rankings:");
        for (int i = 0; i < teams.size(); i++) {
            System.out.println((i+1) + ". " + teams.get(i).getName());
        }
    }
}
