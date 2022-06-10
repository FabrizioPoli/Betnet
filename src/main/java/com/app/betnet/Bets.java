package com.app.betnet;

public class Bets {

    private int betId;
    private static int countingID = 0;
    private String betName;
    private String betTime;

    public Bets(String betName, String betTime) {
        betId = countingID;
        countingID++;
        this.betName = betName;
        this.betTime = betTime;
    }

    public int getBetId() {
        return betId;
    }

    public String getBetName() {
        return betName;
    }

    public void setBetName(String betName) {
        this.betName = betName;
    }

    public String getBetTime() {
        return betTime;
    }

    public void setBetTime(String betTime) {
        this.betTime = betTime;
    }
}
