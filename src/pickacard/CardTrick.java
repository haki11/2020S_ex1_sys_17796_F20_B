package pickacard;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author  santhosh kumar
 * date 4/10/2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Random ran = new Random();
        for(int i=0;i<magicHand.length;i++)
        {
            Card c = new Card();

            c.setValue(ran.nextInt(13)+1); // randomly generate a value between [1,13]
            c.setSuit(Card.SUITS[ran.nextInt(4)]); // randomly generate a number between [0,3] and get the String stores in SUITS array in that index
            magicHand[i] = c; // set ith card of magicHand to c
        }

        // create a default user card
        Card userCard = new Card();
        int value;
        String suit;
        boolean found = false;

        Scanner scan = new Scanner(System.in);
        // input the value and suit for the card
        System.out.print("Enter the value of the card(1-13): ");
        value = scan.nextInt();
        System.out.print("Enter the suit of the card"+Arrays.toString(Card.SUITS)+": ");
        suit = scan.next();

        // set the value and suit for the user card
        userCard.setValue(value);
        userCard.setSuit(suit);

        // loop to determine if userCard is present in magicHand
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        // display the result based on the search
        if(found)
            System.out.println("User card found in magicHand");
        else
            System.out.println("User card not found in magicHand");
    }

}



