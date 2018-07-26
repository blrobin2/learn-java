package com.blrobin2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Player joe = new FootballPlayer("Joe");
        Player pat = new BaseballPlayer("Pat");
        Player beckham = new SoccerPlayer("Beckham");

        Team adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());
    }
}
