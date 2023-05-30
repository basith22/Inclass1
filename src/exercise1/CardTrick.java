package exercise1;


import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author abdul basith
 * @author abdul basith may 30, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random random = new Random();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

                Scanner scanner = new Scanner(System.in);
        System.out.print("Enter card value (1-10, 11 for jack, 12 for queen, 13 for king): ");
        int value = scanner.nextInt();
        System.out.print("Enter card suit (0 for hearts, 1 for diamonds, 2 for clubs, 3 for spades): ");
        int suit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit]);

        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author abdul basith may 30 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is basith, but you can call me basith,");
        System.out.println();
        
        System.out.println("My career ambitions: Automobile enthusiast");
        System.out.println("creative thinking");
        System.out.println("make good friends");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- reading");
        System.out.println("-- music");
        System.out.println("-- cricket");
        System.out.println("-- driving");

        System.out.println();
        
    
    }

}
