package com.blrobin2;

public class Main {

    public static void main(String[] args) {
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantele = new Team<>("Fremantele");

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        footballLeague.add(melbourne);
        footballLeague.add(hawthorne);
        footballLeague.add(adelaideCrows);
        footballLeague.add(fremantele);


        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        //footballLeague.add(baseballTeam);
        hawthorne.matchResult(fremantele, 1, 0);
        hawthorne.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantele, 1, 0);

        footballLeague.showLeagueTable();
    }
}
