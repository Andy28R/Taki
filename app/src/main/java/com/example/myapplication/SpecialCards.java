package com.example.myapplication;

public class SpecialCards {
    public static boolean specialADD(Card card){
        return card.getType().equals("+");
    }

    public static boolean specialPLUS2(Card card){
        return card.getType().equals("+2");
    }

    public static boolean specialTAKI(Card card){
        return card.getType().equals("TAKI");
    }
}
