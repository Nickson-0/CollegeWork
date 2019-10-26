package week8_switchstatements;

/* SELF ASSESSMENT 
1. Did I use appropriate CONSTANTS instead of numbers within the code? 
    Mark out of 5: 5
    Comment: My constants replace numbers in my code
2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE? 
    Mark out of 5: 5
     Comment: Constants in uppercase.
3. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)? 
    Mark out of 10: 10
     Comment:lowerCamelCase is used consistently
4. Did I indent the code appropriately? 
    Mark out of 10: 10
     Comment: My code is indented
5. Did I use an appropriate loop (or loops) to produce the different verses? 
    Mark out of 20: 20
     Comment: used a loop to avoid repetition
6. Did I use a switch to build up the verses? 
    Mark out of 25: 25
     Comment: 2 switches used
7. Did I avoid duplication of code and of the lines which make up the verses (each line should be referred to in the code only once (or twice))? 
    Mark out of 10: 10
     Comment: No single line is repeated.
8. Does the program produce the correct output? 
    Mark out of 10: 10
     Comment: it prints out all the verses using only 2 switchs
9. How well did I complete this self-assessment? 
    Mark out of 5: 5
     Comment: To the highest standard i could achieve
Total Mark out of 100 (Add all the previous marks): 100
*/

public class TwelveDaysOfChristmas {

	public static final int MAX_DAYS = 12;

	public static void main(String[] args) {

		int dayOfChristmas = 1, songVerse = 1;
		while (dayOfChristmas <= MAX_DAYS && songVerse <= MAX_DAYS) {

			String day = "";
			switch (dayOfChristmas) {
			case 1: 
				day = "first";
				dayOfChristmas++;
				break;
			case 2:
				day = "second";
				dayOfChristmas++;
				break;
			case 3:
				day = "third";
				dayOfChristmas++;
				break;
			case 4:
				day = "fourth";
				dayOfChristmas++;
				break;
			case 5: 
				day = "fifth";
				dayOfChristmas++;
				break;
			case 6:
				day = "sixth";
				dayOfChristmas++;
				break;
			case 7:
				day = "seventh";
				dayOfChristmas++;
				break;
			case 8:
				day = "eighth";
				dayOfChristmas++;
				break;
			case 9:
				day = "ninth";
				dayOfChristmas++;
				break;
			case 10: 
				day = "tenth";
				dayOfChristmas++;
				break;
			case 11: 
				day = "eleventh";
				dayOfChristmas++;
				break;
			case 12:
				day = "twelfth";
				dayOfChristmas++;
				break;
			}

			System.out.print("On the "+day+" day of Christmas\r\n" + 
					"my true love sent to me:\n");


			switch (songVerse) {
			case 12: 
				System.out.print("Twelve Drummers Drumming,\n");
			case 11:
				System.out.print("Eleven Pipers Piping,\n");
			case 10:
				System.out.print("Ten Lords a-leaping,\n");
			case 9:
				System.out.print("Nine Ladies dancing,\n");
			case 8: 
				System.out.print("Eight Maids a-milking,\n");
			case 7:
				System.out.print("Seven Swans a-swimming,\n");
			case 6:
				System.out.print("Six Geese a-laying,\n");
			case 5:
				System.out.print("Five Golden Rings,\n");
			case 4:
				System.out.print("Four Calling Birds,\n");
			case 3: 
				System.out.print("Three French Hens,\n");
			case 2: 
				System.out.print("Two Turtle Doves,\nAnd a Partridge in a Pear Tree.\n\n");
				songVerse++;
				break;
			case 1:
				System.out.print("A Partridge in a Pear Tree.\n\n");
				songVerse++;
				break;
			}


		}

	}
}
