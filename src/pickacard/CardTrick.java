package pickacard;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

/**
 *    To be used as starting code in ICE 1
 * @author Nikolas Smith - 991 163 100
 * @author dancye
 * @author Paul Bonenfant
 */
public class CardTrick {

    public static void main(String[] args) {
        Random rand = new Random();
        
        Card[] magicHand = new Card[7];
        Card c = new Card();
        
        // User card
        Card u = new Card();
        
        //#insert code to ask the user for Card value and suit, create their card
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter suit (0 = Hearts, 1 = Diamonds, 2 = Spades, 3 = Clubs): ");
        int cSuit = sc.nextInt();
        u.setSuit(Card.SUITS[cSuit]);
        
        System.out.print("Enter value: (1-13): ");
        int nValue = sc.nextInt();
        u.setValue(nValue);
        System.out.println("Your card is a " + u.getValue() + " of "+ u.getSuit() + ".");
        
        for (int i = 0; i < magicHand.length; i++) {
            // Generate random integers
            int rand_int1 = rand.nextInt(14); 
            int rand_int2 = rand.nextInt(4); 
            //c.setValue(insert call to random number generator here)
            c.setValue(rand_int1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand_int2]);
            // and search magicHand here
                if(c.getSuit().equals(u.getSuit()) && c.getValue() == (u.getValue())){
                    System.out.println("******* MATCH FOUND!! *******");
                    System.out.println("The card that matched from Magic Hand deck was a " + c.getValue() + " of " + c.getSuit() + "!");
                    System.exit(0);
                } 
            // Then report the result here
            System.out.println("No matches found. Here is card" + " " + i + " " + "in the Magic Hand deck: | " + c.getValue() + " " + c.getSuit());
        }
    }
}
