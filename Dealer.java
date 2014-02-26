import java.util.Scanner;
import java.util.ArrayList;

public class Dealer{
  private ArrayList<Card> deck = new ArrayList<Card>();
  
  public void fill() // fills the deck with the various cards into an array list
  {
    for(int i=1; i<14; i++){
      deck.add(new Card (i, "hearts")); // adds cards by suit through the deck
    }
    for(int i=1; i<14; i++){
      deck.add(new Card (i, "spades"));
    }
    for(int i=1; i<14; i++){
      deck.add(new Card (i, "diamonds"));
    }
    for(int i=1; i<14; i++){
      deck.add(new Card (i, "clubs"));
    }
  }
  private ArrayList<Card> playerhand = new ArrayList<Card>();//the cards in the players hand
  private ArrayList<Card> dealerhand = new ArrayList<Card>();//the cards in the dealer hand
  
  public void deal(){
    boolean quit = false;
    System.out.println("Deck size = " + deck.size());
    int totalcards = 0;//this keeps track of the players hand
    
    playerhand.add(deck.remove((int)(Math.random()*deck.size())));
    totalcards++;
    playerhand.add(deck.remove((int)(Math.random()*deck.size())));
    totalcards++;
     for (Card c : playerhand)
    {
      System.out.println(c);
    }
    
    while (!quit) {
    Scanner kb = new Scanner(System.in); //brings in the keyboard where user can type in choice
    String choice = kb.nextLine();
    
    if(choice.equals("hit")){
      playerhand.add(deck.remove((int)(Math.random()*52)));
      for (Card c : playerhand)
    {
      System.out.println(c);
    }
    }
    else if(choice.equals("stand")){
      // stand
    }
    else{
      boolean quite = true;
    }
    }
    }
  
}