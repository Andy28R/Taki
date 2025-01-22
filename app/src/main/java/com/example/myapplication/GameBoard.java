package com.example.myapplication;
import java.util.*;
public class GameBoard {
    private ArrayList<Player> players;
    private int currentPlayerTurn;
    private Card currentCard;


    public GameBoard(ArrayList<Player> players){
        this.players = players;
    }

    public void placeCard(Card card){
        currentCard = card;
    }

    public void nextPlayerTurn(){
        currentPlayerTurn = (currentPlayerTurn + 1) % 2;
    }

    public Player currentPlayerTurn(){
        return players.get(currentPlayerTurn);
    }

    public Card getCurrentCard(){
        return currentCard;
    }

}
