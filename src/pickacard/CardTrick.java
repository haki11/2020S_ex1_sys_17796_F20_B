package pickacard;

import java.util.Arrays;
import java.util.Random;
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
        Random ran = new Random();
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(ran.nextInt(13)+1);//c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[ran.nextInt(4)]);
            magicHand[i] = c;//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }

        Card userCard = new Card();
        int value;
        String suit;
        boolean found = false;//insert code to ask the user for Card value and suit, create their card
        Scanner scan = new Scanner(System. in);
        System.out.print("pick a card");
        value = scan.nextInt();
        System.out.print("Enter a suit");
        suit = scan.next();
        userCard.setValue(value);
        userCard.setSuit(suit);
        
        
        for(int i=0;i<magicHand.length;i++)
            {
                if(magicHand[i].getValue() == userCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(userCard.getSuit()))
                {
                    found = true;
                    break;
                }
            }
         if(found)
            System.out.println("card found in magchand");
         else
            System.out.println("card not found in magichand");
    }// and search magicHand here
        //Then report the result here
    

}
