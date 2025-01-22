package com.example.myapplication;
import java.util.*;
public class Deck {
    private ArrayList<Card> deck;
    public Deck(){
        this.deck = new ArrayList<>(); // new deck containing all cards
        String[] colors = {"Red","Blue","Yellow","Green"};
        String[] specialTypes = {"+2","+","TAKI"};

        for (String color : colors)
            for (int i = 3; i < 9; i++) {
                for (int j = 0; j < 2; j++) {
                    deck.add(new Card(color, String.valueOf(i)));
                }
            }

        for (String color : colors){
            for (int i = 0; i < 2; i++) {
                deck.add(new Card(color, specialTypes[0]));
                deck.add(new Card(color, specialTypes[1]));
            }
        }

        for (int i = 0; i < 8; i++) {
            deck.add(new Card("Purple", specialTypes[2]));
        }

        Collections.shuffle(deck);

    }
    public Card takeCardFromDeck(){
        if (deck.size() > 0){
            Collections.shuffle(deck);
            return deck.remove(deck.size() - 1);
        }
        return null;
    }

    public int remainingCards() {
        return deck.size();
    }
}
