package com.blrobin2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckham);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        System.out.println(adelaideCrows.numPlayers());

        // By restricting T to Player, this won't work
        //Team<String> brokenTeam = new Team<>("this won't work");
        //brokenTeam.addPlayer("no one");

        Team<SoccerPlayer> soccerTeam = new Team<>("soccer");
        soccerTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer gordon = new FootballPlayer("Gordon");
        melbourne.addPlayer(gordon);

        Team<FootballPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantele = new Team<>("Fremantele");

        hawthorne.matchResult(fremantele, 1, 0);
        hawthorne.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantele, 1, 0);
        //adelaideCrows.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings:");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantele.getName() + ": " + fremantele.ranking());
        System.out.println(hawthorne.getName() + ": " + hawthorne.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorne));

        System.out.println(hawthorne.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantele));

        //ArrayList<Team> teams;
        //Collections.sort(teams);
    }
}
