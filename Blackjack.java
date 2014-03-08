public class Blackjack{
  public static void main (String[] args){
    System.out.println("Welcome to the Blackjack Simulator");
    System.out.println("If you would like to quit please type it in");
    System.out.println("Type in whether you want to hit, stand, or quit"); //instructions
    System.out.println("Aces are worth 1");
    System.out.println(" ");
    
    Dealer game = new Dealer(); //creates a new dealer
    game.fill(); //fills the deck
    game.deal(); //deals the first hand

  }
}

// fix deck size *fixed
// stand immediately outofbounds error *fixed
// for loop over looping in dealer hand *fixed
// doubling the players outcome hand * fixed
// 1st choice stand problem still? * fixed
// problem 1 hit... then stand doubling * fixed
// maybe add the 1 or 11 for aces