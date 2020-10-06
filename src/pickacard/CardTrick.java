
package pickacard;

import static java.lang.System.in;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * //Connor Cox
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
        c.setValue((int)((Math.random()* 13)+ 1));  
         c.setSuit(Card.SUITS [(int)(Math.random()* 4)]);
        magicHand[i] = c;
        //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
          }
       
    System.out.println ("Pick a card number between 1-13");
    int cardChosen = input.nextInt();
    System.out.print("Enter a number between 0-3 (0 = Hearts, "
           + "1 = Diamonds, 2 = Spades, and 3 = Clubs):  ");
        int suitChosen = input.nextInt();
      // I edit directly on github
       Card a = new Card();

        a.setValue((int)(cardChosen));
        a.setSuit(Card.SUITS[(int)(suitChosen)]);
        System.out.println("your chosen card is: " + cardChosen + " of " + 
                Card.SUITS[suitChosen]);

        System.out.println("The Magic Hand is: ");
    for (Card c : magicHand){ 
            System.out.println(c.getValue() + " of " + c.getSuit());
}
       for (Card c : magicHand) {
            if (a.getValue() == c.getValue() 
                && a.getSuit().equals(c.getSuit())){ 
                System.out.println("Your card is in the magic hand!");
            }else{
                System.out.println("your card was not one of the cards in the "
            + "magic hand");
    }
}
    }
    
    

}



