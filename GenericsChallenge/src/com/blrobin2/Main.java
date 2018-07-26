package com.blrobin2;

public class Main {

    public static void main(String[] args) {
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantele = new Team<>("Fremantele");

        League<FootballPlayer> footballLeague = new League<>("Australian Football League");
        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(hawthorne);
        footballLeague.addTeam(fremantele);

        if (!footballLeague.addTeam(adelaideCrows)) {
            System.out.println(adelaideCrows.getName() + " is already in league!");
        }

        // Cannot add
        //Team<BaseballPlayer> cubs = new Team<>("Chicago Cubs");
        //footballLeague.addTeam(cubs);

        hawthorne.matchResult(fremantele, 1, 0);
        hawthorne.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantele, 1, 0);

        footballLeague.printRankings();
    }
}
