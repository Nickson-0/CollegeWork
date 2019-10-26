package week6_errorhandling_nestedloops;

/* SELF ASSESSMENT 
1. Did I use appropriate CONSTANTS instead of numbers within the code? 
    Mark out of 5: 5
    Comment: yes they are relevant
2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE? 
    Mark out of 5: 5
    Comment: Yes
3. Did I use easy-to-understand meaningful variable names? 
    Mark out of 10: 10
    Comment:  Yes
4. Did I format the variable names properly (in lowerCamelCase)? 
    Mark out of 5: 5
    Comment:  yes
5. Did I indent the code appropriately? 
    Mark out of 10: 10
    Comment:  yes
6. Did I use an appropriate loop to allow the user to enter their guesses until they win or lose? 
    Mark out of 20: 20
    Comment:  yes
7. Did I check the input to ensure that invalid input was handled appropriately? 
    Mark out of 10: 10
    Comment:  yes, the programme restarts if an invalid entry is made
8. Did I generate the cards properly using random number generation (assuming all cards are equally likely each time)? 
    Mark out of 10: 10
    Comment:  yes I used a random number function
9. Did I output the cards correctly as 2, 3, 4, ... 9, 10, Jack, Queen, King? 
    Mark out of 10: 10
    Comment:  Yes
10. Did I report whether the user won or lost the game before the program finished? 
    Mark out of 10: 10
    Comment:  Yes
11. How well did I complete this self-assessment? 
    Mark out of 5: 5
    Comment:  The programme is working efficiently
Total Mark out of 100 (Add all the previous marks): 
*/



import java.util.Random;
import java.util.Scanner;

public class HiLoAssignment {

	public static final int ACE = 14;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

	public static void main (String[] args) {
		Scanner userGuess = new Scanner (System.in);
		Random generator = new Random();

		int card = 2 + generator.nextInt(13), guess = 1;

		boolean correct = true;
		while (guess <= 4 && correct ) {

			int lastCard = 2 + generator.nextInt(13);

			if (card == JACK)
			{
				System.out.println("The card is a Jack");
			}
			else if (card == QUEEN) 
			{
				System.out.println("The card is a Queen");
			}
			else if  (card == KING) 
			{
				System.out.println("The card is a King");
			}
			else if (card == ACE)
			{
				System.out.println("The card is an Ace");
			}
			else 
			{
				System.out.println("The card is a "+card);
			}
			System.out.println("Do you think the next card will be higher, lower or equal?");

			if (userGuess.hasNext("higher") || (userGuess.hasNext("lower") || (userGuess.hasNext("equal")))) 
			{
				if (userGuess.hasNext("higher"))
				{
					if (lastCard > card)
					{
						correct = true;
					}
					else 
					{
						correct = false;
					}	
					userGuess.next();
				}
				else if (userGuess.hasNext("lower")) {
					if (lastCard < card)
					{
						correct = true;
					}
					else
					{
						correct = false;
					}
					userGuess.next();
				}
				else if (userGuess.hasNext("equal")) {
					if (lastCard == card)
					{
						correct = true;
					}
					else
					{
						correct = false;
					}
					userGuess.next();

				}
			} else {
				System.out.println("Invalid input. Please make sure its cAsE sEnSiTiVe and is either 'higher', 'lower' or 'equal'");
				userGuess.close();
				System.exit(0);
			}

			guess++; 
			card = lastCard;

		} 
		if (correct) {
			System.out.println("Congratulations. You got them all correct.");
		}
		else {
			System.out.println("Unfortunately, you guessed wrong!");
			if (card == JACK)
			{
				System.out.println("The card was a Jack");
			}
			else if (card == QUEEN)
			{
				System.out.println("The card was a Queen");
			}
			else if  (card == KING)
			{
				System.out.println("The card was a King");
			}
			else if (card == ACE)
			{
				System.out.println("The card was an Ace");
			}

			else 
			{
				System.out.println("The card was a "+card);
			}
		}
	}
}