package com.app.betnet;

public class Bets {

    private int betId;
    private static int countingID = 0;
    private String betName;
    private String betTime;
    private String location;
    private String bet;

    public Bets(String betName, String betTime, String location) {
        betId = countingID;
        countingID++;
        this.betName = betName;
        this.betTime = betTime;
        this.location = location;
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

    public String getLocation(){
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBet(String bet) {
        this.bet = bet;
    }

    public String getBet() {
        return bet;
    }
}
