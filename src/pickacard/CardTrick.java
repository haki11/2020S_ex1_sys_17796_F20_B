package pickacard;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Tyler Gaetan
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
        
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit(Card.SUITS[2]);
            
        for(int i= 0; i < magicHand.length; i++)
        {
            if(luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equals(magicHand[i].getSuit())){
                System.out.println("Congratulations! you got the lucky card!");
            }
            else
            {
                System.out.println("You did not receive the lucky card");
            }
                
        }
        
        
             
//        sc.close();
    }

}
