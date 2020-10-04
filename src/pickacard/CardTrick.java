package pickacard;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            c.setValue((int) (Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
            magicHand[i] = c;
            //System.out.println(c.getSuit() +" "+ c.getValue());
            /*Print Statement for debugging*/
        }
        Scanner sc = new Scanner(System.in);
        Card g = new Card();
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Please enter value for a suit(between 0-3)");
        int guessSuit = sc.nextInt();
        System.out.println("Please enter a card value(between 1-13)");
        int guessCard = sc.nextInt();
      
        g.setValue(guessCard);
        g.setSuit(Card.SUITS[(guessSuit)]);
        //System.out.println(g.getSuit() + g.getValue());
        /*Print statement for debugging*/
        
        // and search magicHand here
         for(int i = 0; i < magicHand.length; i++)
        {
        if(g.getValue() == magicHand[i].getValue() && g.getSuit().equals(magicHand[i].getSuit()))
        {
          //Then report the result here
          System.out.println("Good job! You guessed correctly.");
        }
        /*else statement will repeat for each iteration of the array*/
        }
         
         
        sc.close();
    }

}
