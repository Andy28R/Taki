package com.example.myapplication;
import java.util.*;


public class Player {
    private String userName;
    private ArrayList<Card> hand;
    private int totalTurns;
    private int totalGames;


    public Player(String userName){
        this.userName = userName;
        this.hand = new ArrayList<>();
    }

    public void addCardToHand(Card card){
        hand.add(card);
    }

    public boolean hasWin(){
        return hand.isEmpty();
    }

    public ArrayList<Card> getHand(){
        return hand;
    }

    public int getTotalTurns() {
        return totalTurns;
    }

    public void setTotalTurns(int totalTurns) {
        this.totalTurns = totalTurns;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }


}
