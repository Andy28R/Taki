package com.example.myapplication;
import java.util.*;
public class Card {
    private String color;
    private String type;

    public Card(String color, String type){
        this.color = color;
        this.type = type;
    }



    public String getColor(){
        return color;
    } // color of the card

    public String getType(){
        return type;
    } // type of the card

    public boolean validCard(Card otherCard){ // checks whether the card can be placed on the table
        return (this.color.equals(otherCard.getColor()) || this.type.equals(otherCard.getType()));
    }
}
