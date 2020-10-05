package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author zenanwang
 */
public class CardTrick {
    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        generator.setSeed(System.currentTimeMillis());
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(generator.nextInt(13) + 1);
            c.setSuit(Card.SUITS[generator.nextInt(4)]);
            magicHand[i] = c;
        }
   
        Card key = new Card();
        key.setValue(4);
        key.setSuit("spades");
        boolean found = false;
        System.out.println("Searching for: " + key);
        
        
        
        for (int i = 0; i < magicHand.length; i++) {
            if ((magicHand[i].getValue() == key.getValue()) && magicHand[i].getSuit().equalsIgnoreCase(key.getSuit())) {
                System.out.println("Card is found in magic hand at index " + (i+1));
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Card is not found in magic hand.");
    }
}