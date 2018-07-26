package com.blrobin2;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        }
        members.add(player);
        System.out.println(player.getName() + " picked for team " + this.name);
        return true;
    }

    int numPlayers() {
        return this.members.size();
    }

    void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        return Integer.compare(team.ranking(), ranking());
    }
}
