public class Blackjack{
  public static void main (String[] args){
    System.out.println("Welcome to the Blackjack Simulator");
    System.out.println("If you would like to quit please type it in");
    System.out.println("Type in whether you want to hit, stand, or quit");
    System.out.println("Here are your cards...");
    
    Dealer game = new Dealer();
    game.fill();
    game.deal();

  }
}