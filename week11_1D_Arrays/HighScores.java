package week11_1D_Arrays;
/* SELF ASSESSMENT

1. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)?

       Mark out of 5: 5 
       Comment: lower camel case is implemented

2. Did I indent the code appropriately?

       Mark out of 5: 5
       Comment: code is indented correctly

3. Did I write the initialiseHighScores function correctly (parameters, return type and function body) and invoke it correctly?

      Mark out of 15: 15
      Comment: the function is functioning correctly

4. Did I write the printHighScores function correctly (parameters, return type and function body) and invoke it correctly?

      Mark out of 15: 15 
      Comment: yes the function is written correctly

5. Did I write the higherThan function correctly (parameters, return type and function body) and invoke it correctly?

      Mark out of 15: 15 
      Comment: yes i wrote

6. Did I write the insertScore function correctly (parameters, return type and function body) and invoke it correctly?

      Mark out of 20: 20
      Comment: yes

7. Did I write the main function body correctly (first asking for the number of scores to be maintained and then repeatedly asking for scores)?

      Mark out of 20: 20 
      Comment: yes

8. How well did I complete this self-assessment?

       Mark out of 5: 5
       Comment: well

Total Mark out of 100 (Add all the previous marks): 100

*/


import java.util.Scanner;

public class HighScores {
	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);
		System.out.println("How many scores do you want to maintain? ");

		if (!inputScanner.hasNextInt()) {
			System.out.println("Invalid Input! Please try again ");
			System.exit(0);
			//main(args);
		}

		int inputCounter = inputScanner.nextInt();

		if (inputCounter <= 0) {
			System.out.println("Invalid Input!");
			System.exit(0);
		}

		int[] highScoreArray = new int[inputCounter];
		initialiseHighScore(highScoreArray, inputCounter);

		int counter = 0;
		while (counter < highScoreArray.length) {
			System.out.println("Input score: ");

			if (!inputScanner.hasNextInt()) {
				System.out.println("Invalid Input!");
				System.exit(0);
			} else {
				counter++;
				int inputNumber = inputScanner.nextInt();

				if (higherThan(inputNumber, highScoreArray)) {
					insertScore(inputNumber, highScoreArray, inputCounter);
				} else {
					inputCounter--;
				}
			}
		}

		printHighScores(highScoreArray, inputCounter);
		inputScanner.close();
	}

	public static void initialiseHighScore(int[] highScoreArray, int inputCounter) {

		int counter = 0;

		if (highScoreArray == null) {
			return;
		}

		while (inputCounter > counter) {
			highScoreArray[counter] = 0;
			counter++;
		}
		return;
	}

	public static void printHighScores(int[] highScoreArray, int inputCounter) {

		if (inputCounter == 1) {
			System.out.print("The high score is ");
		}

		else {
			System.out.print("The high scores are ");
		}

		System.out.print(highScoreArray[0]);
		for (int index = 1; index < inputCounter; index++) {
			System.out.print(", " + highScoreArray[index]);
		}
		System.out.print(".");
	}

	public static boolean higherThan(int inputNumber, int[] highScoreArray) {

		int counter = 0;

		boolean isHigher = false;
		while (!isHigher && counter < highScoreArray.length) {
			if (inputNumber > highScoreArray[counter]) {
				isHigher = true;
			}
			counter++;
		}
		return isHigher;
	}

	public static void insertScore(int inputNumber, int[] highScoreArray, int inputCounter) {

		int counter = 0;

		while (inputNumber < highScoreArray[counter]) {
			counter++;
		}

		if (highScoreArray[counter] != 0) {
			for (int previousCounter = inputCounter - 2; previousCounter >= counter; previousCounter--)
				highScoreArray[previousCounter + 1] = highScoreArray[previousCounter];
		}
		highScoreArray[counter] = inputNumber;
	}
}


