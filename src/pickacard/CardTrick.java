package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Julia Soifert
 * @author dancye
 * @author Paul Bonenfant
 * Last modified Oct. 9, 2020 by Julia Soifert
 */
public class CardTrick {

    /** getRandom used to generate both the random number for Value and Suit
    ** for magicHand
    * @param max = maximum number that can be randomized
    * @param min = minimum number that can be randomized
    * @return generate random integer
    **/
    private static int getRandom(int max, int min) {

        int generate = (int) (Math.random() * (max - min + 1) + min);
        return generate;
    }

    /**Prompts user to input Suit for card picked and checks for validity
     @return strHold1 Character for what suit the card is**/
    private static String enterSuit() {

        String strHold = "x";//flag for first time through and invalid input
        String strHold1 = "";
        Scanner s = new Scanner(System.in);
        while (strHold1.equals("")) {

            if (strHold.equals("x")) {
                System.out.println("Please enter card suit D H C S : ");
                strHold = s.nextLine();
                strHold=strHold.toUpperCase();
                
            } else {
                System.out.println("Invalid suit");
                strHold = "x";
            }
            if (strHold.equals("D") || strHold.equals("H") || strHold.equals("S") || strHold.equals("C")) {
                strHold1 = strHold;
            }
        }

        return strHold1;
    }

    /**Converts random numeric into character to denote suit
     @return hold is the character that is sorted through the switch statement to denote Suit
     @param inSuit suit in integer form**/
    private static String doSuit(int inSuit) {
        String hold;
        switch (inSuit) {
            case 0:
                hold = "D";
                break;
            case 1:
                hold = "H";
                break;
            case 2:
                hold = "S";
                break;
            case 3:
                hold = "C";
                break;
            default:
                hold = "x";
                break;
        }
        return hold;

    }
/** Prompts user to enter value of card picked
 /**
 * @return intHold is the value of the card that the user has picked**/
    private static Integer enterNum() {

        Scanner s = new Scanner(System.in);
        int intHold = 14;

        while (intHold > 13) {
            System.out.println("Please enter value of card : ");
            intHold = s.nextInt();
        }

        return intHold;
    }

    /**
     *The main creates the 7 card magic Hand and tells user if they won
     * @param args
     */
    public static void main(String[] args) {
        String strHold;
        int intHold;

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            c.setValue(getRandom(13, 1));
            intHold = getRandom(3, 0);
            System.out.println("intHold : " + intHold);
            strHold = doSuit(intHold);
            c.setSuit(strHold);
            magicHand[i] = c;
            System.out.println(magicHand[i]);
           
        }
        
        Card pickCard = new Card();
        pickCard.setSuit(enterSuit());
        pickCard.setValue(enterNum());

        for (int i = 0; i < magicHand.length; i++) {
           // System.out.println("got here" + magicHand[i]);
  
           if (magicHand[i].toString().equals(pickCard.toString())) {
                System.out.println("You Win!");
            }

        }
    }

}
