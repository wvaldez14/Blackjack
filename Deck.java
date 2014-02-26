public class Deck{
  
  static String[] primedeck =  {"1C","2C","3C","4C","5C","6C","7C","8C","9C","10C","JC","QC","KC","AC",
    "1S","2S","3S","4S","5S","6S","7S","8S","9S","10S","JS","QS","KS","AS",
    "1H","2H","3H","4H","5H","6H","7H","8H","9H","10H","JH","QH","KH","AH",
    "1D","2D","3D","4D","5D","6D","7D","8D","9D","10D","JD","QD","KD","DA"}; //untouched deck to reset deck after play
  
  static String[] deck =  {"1C","2C","3C","4C","5C","6C","7C","8C","9C","10C","JC","QC","KC","AC",
    "1S","2S","3S","4S","5S","6S","7S","8S","9S","10S","JS","QS","KS","AS",
    "1H","2H","3H","4H","5H","6H","7H","8H","9H","10H","JH","QH","KH","AH",
    "1D","2D","3D","4D","5D","6D","7D","8D","9D","10D","JD","QD","KD","DA"}; //deck that gets drawn from
   
  public void givecard() {
    int random = (int)(Math.random()*52);// picks a random card from the arraylist
    String card = deck[random];
    deck[random] = ""; // leaves an empty space where that random card was to ensure the card doesn't get replayed
    System.out.println(card); //prints the random card
  }
}