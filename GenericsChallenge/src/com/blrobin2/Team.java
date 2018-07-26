package com.blrobin2;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    Team(String name) {
        this.name = name;
    }

    String getName() {
        return name;
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
        if (played <= 0) {
            return Integer.MIN_VALUE;
        }
        return ((won * 2) + tied - lost) / played;
    }

    @Override
    public int compareTo(Team<T> team) {
        return Integer.compare(team.ranking(), ranking());
    }
}
