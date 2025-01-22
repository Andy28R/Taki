package com.example.myapplication;

import java.util.ArrayList;

public class GameManager {
    private GameBoard board;
    private Deck deck;
    private ArrayList<Player> players;

    public GameManager(ArrayList<Player> players){
        this.board = new GameBoard(players);
        this.deck = new Deck();
        this.players = players;
    }

    public void dealCards(){
        for (Player player : players){
            for (int i = 0; i < 10; i++) {
                player.addCardToHand(deck.takeCardFromDeck());
            }
        }
    }

    public void placeFirstCard(){
        board.placeCard(deck.takeCardFromDeck());
    }


    public boolean playerTurn (Player player, Card card){
        if (card.validCard(board.getCurrentCard())){
            player.getHand().remove(card);
            board.placeCard(card);
            return true;
            //check if special card, if it is - do something
        }
        return false;
    }


    public boolean isGameOver(){
        for (Player player: players){
            if(player.hasWin()){
                return true;
            }
        }
        return false;
    }


}
