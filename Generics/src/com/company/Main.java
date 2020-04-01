package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> mancity = new Team<>("Manchester City");
        mancity.addPlayer(joe);
//        mancity.addPlayer(pat);
//        mancity.addPlayer(beckham);

        System.out.println(mancity.numPlayers());

        Team<BaseballPlayer> chicago = new Team<>("Chicago Cubs");
        chicago.addPlayer(pat);

        Team<BaseballPlayer> la = new Team<>("LA Galaxy");
        chicago.addPlayer(pat);

//        Team<String> failTeam = new Team<>("Fail");
////        failTeam.addPlayer("fail");

        chicago.matchResult(la,2,4);
//        chicago.matchResult(mancity,2,1);

        System.out.println("Rankings");
        System.out.println(la.getName()+": "+la.ranking());
        System.out.println(chicago.getName()+": "+chicago.ranking());

        System.out.println(la.compareTo(chicago));
        System.out.println(chicago.compareTo(la));
        System.out.println(chicago.compareTo(chicago));
    }
}
