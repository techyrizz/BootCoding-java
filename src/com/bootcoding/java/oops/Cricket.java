package com.bootcoding.java.oops;

public class Cricket {
    String teamName;
    String captainName;
    String bestBatsman;
    int highestScore;
    public void batting(){
        System.out.println("Match Started");
    }
    public void print(){
        System.out.println("Team Name = " +teamName);
        System.out.println("Captain Name = " +captainName);
        System.out.println("Best Batsman = " +bestBatsman);
        System.out.println("Highest Score= " +highestScore);
    }
}
