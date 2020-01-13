/*
Yi Tan <tan5@sheridan.desire2learn.com>
----------------------------------------------------------------------
 */
package com.mycompany.simplecardexample;
//yet another commit
//add a line for testing clone
/**
 *
 * @author Yi Tan <tan5@sheridan.desire2learn.com>
 */
public class Card {
    
    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        if(suit.equals("Spades") || suit.equals("Diamond") || suit.equals("Clubs") || suit.equals("Hearts"))
                 this.suit = suit;
        else {
            System.out.println("Incorrect suit. Please enter a valid suit");
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value >0 && value <14)
            this.value = value;
        else 
        {
            System.out.println("please enter a correct value ");
        }
    }
    
    
    
}
