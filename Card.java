public class Card{ //card class encharge of keeping the int value of the cards, the suit, and the interface for the face cards
  private int value;
  private String suit;
  public Card(int v, String s){ //Constructor from the arraylist of cards
    value = v;
    suit = s;
  }
  public int getValue(){ // value of card
    if(value>10){ //for the face cards which value is above 10, set the value as 10 (jacks,kings,queens)
      value = 10;
    }
    return value;
  }
  public String getSuit(){ //suit of card
    return suit;
  }
  public String toString()// for the interface printing values and suit of cards
  {
    if(value == 1){
      return "The Ace of " + suit + "."; // Prints out Ace instead of 1
    }
    else if(value>10){
      if(value == 11){
        return "The Jack of " + suit + "."; //the face cards say its name instead of the numerical value the fill deck gave it
      }
      else if(value == 12){
        return "The Queen of " + suit + ".";
      }
      else if(value == 13){
        return "The King of " + suit + ".";
      }
    }
    return "The " + value + " of " + suit + ".";
  }
}