import java.util.Scanner;
import java.util.ArrayList;

public class Dealer{
  private ArrayList<Card> deck = new ArrayList<Card>(); //makes an arraylist of the deck
  
  public void fill() // fills the deck with the various cards into an array list
  {
    
    for(int i=1; i<13; i++){ // uses for loop to fill an arraylist by suit
      deck.add(new Card (i, "hearts"));
    }
    for(int i=1; i<13; i++){
      deck.add(new Card (i, "spades")); // adds the cards one by one
    }
    for(int i=1; i<13; i++){
      deck.add(new Card (i, "diamonds"));
    }
    for(int i=1; i<13; i++){
      deck.add(new Card (i, "clubs"));
    }
  }
  private ArrayList<Card> playerhand = new ArrayList<Card>();//the cards in the players hand
  private ArrayList<Card> dealerhand = new ArrayList<Card>();//the cards in the dealer hand
  
  public void deal(){ // deals the first cards to the players
    System.out.println("Here are your cards...");
    boolean quit = false; //loop until the player quits
    boolean oneGame = false; //loop that starts the game again if someone loses
    int totalcards = 0; //keeps track of the total cards
    
    playerhand.add(deck.remove((int)(Math.random()*deck.size())));
    totalcards++;
    playerhand.add(deck.remove((int)(Math.random()*deck.size()))); // deals the player 2 cards
    totalcards++;
    
    dealerhand.add(deck.remove((int)(Math.random()*deck.size())));
    totalcards++;
    dealerhand.add(deck.remove((int)(Math.random()*deck.size()))); // deals the dealer 2 cards
    totalcards++;
    
    for (Card c : playerhand)
    {
      System.out.println(c); //prints out the cards of the player
    }
    
    while (!quit) {//keeps playing until the player quits
      int total = 0;// keeps track of the total value that the player has
      int total2 = 0;// declared the final total for the dealer
      while(!oneGame){
        Scanner kb = new Scanner(System.in); //brings in the keyboard where user can type in choice
        String choice = kb.nextLine();
        
        if(choice.equals("hit")){
          playerhand.add(deck.remove((int)(Math.random()*deck.size())));
          total = 0; // ensures that the value of total doesn't double if I hit more than once
          for (Card c : playerhand)
          {
            System.out.println(c);
            total = total + c.getValue();
          }
          if(total>21){
            System.out.println("bust! your total was: " + total + "\n");
            oneGame = true;
            fill();
            playerhand = new ArrayList<Card>();
            dealerhand = new ArrayList<Card>();
            deal();
          }
        }
        
        else if(choice.equals("stand")){ //(total2 is the dealers hand, total is the players hand)
          total = 0; //makes the value 0 again so it doesn't double the value
          for (Card c : playerhand)
          {
            System.out.println(c);
            total = total + c.getValue(); // calculates the total # value of cards
          }
          for (Card d : dealerhand)
          {
            total2 = total2 + d.getValue(); // calculates the total # value of the dealers hand
          }
          while(total2 < 17){ //dealer must hit if his total value is under 17
            dealerhand.add(deck.remove((int)(Math.random()*deck.size()))); // adds a card to the dealers hand
            total2 = 0; // makes the value 0 again so it doesn't double
            for (Card d : dealerhand) 
            {
              total2 = total2 + d.getValue();// gets the total value of the dealerhand
            }
          }
          if(total2 > 21){
            System.out.println("The dealer bust you won! his score was: " + total2 + "\n"); //if the dealers busts than the player automatically wins
          }
          else if(total2 == total){
            System.out.println("You tied with the dealer");// re-deals if they tie with each other (not really a rule but I made it that)
            System.out.println("You total was " + total + " and the dealer's was " + total2 + ".\n");
          }
          else if(total2 > total){ // dealer wins if his hand is greater after everything else that could've happend
            System.out.println("The dealer won!... your total was " + total + " and the dealer's was " + total2 + " ... Sorry\n");
          }// if the dealer has more points than the dealer wins
          else{ // else it means the player wins
            System.out.println("Yay you won!.... your total was " + total + " and the dealer's was " + total2 + " great job\n");
          }
          oneGame = true; //starts a new game, creates a new line, and loops again until quit
          fill(); // fill deck
          playerhand = new ArrayList<Card>(); // this part just test the reset...(I still need to check 
          dealerhand = new ArrayList<Card>(); // weather the dealers hand beat the players)
          deal(); // deals
          
        }
        else if(choice.equals("quit")){ // if a player types in "quit" then it goes out of the program
          boolean quite = true;
          System.out.println("Thanks for Playing"); // end the game if they type in quit
        }
      }
    }
  }
}

