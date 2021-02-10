/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manlapazcardgame;

/**
 *
 * @author 2ndyrGroupA
 */
public class Card {
    //PRIVATE FIELDS
     private Suit suit;
     private Rank rank;
     private boolean faceUp;
     
     
     //CONSTRUCTOR METHODS
     public Card(Rank rank, Suit suit){
         this.rank= rank;
         this.suit=suit;
         faceUp = false;
     
}
     //PUBLIC METHODS
     public String getSuit(){
         return suit.printSuit();
     }
     public int getRank(){
         return rank.getRank();
     }
     public String toString(){
         String str = "";
         if (faceUp) { 
         str +=rank.getRank() + "of" +
          suit.printSuit();
         }
         else{
             str ="facedown(nothing to see)";
         }
         return str;
     }
}