package week4_iterations_forloops;

/* SELF ASSESSMENT 
1. Did I use appropriate CONSTANTS instead of numbers within the code?  
    Mark out of 5: 5
    Comment: i have used 5 constants
2. Did I use easy-to-understand, meaningful CONSTANT names? 
    Mark out of 5: 5
    Comment: they are clear and concise
3. Did I format the CONSTANT names properly (in UPPERCASE)? 
    Mark out of 5: 5
    Comment: YES!!
4. Did I use easy-to-understand meaningful variable names? 
    Mark out of 10: 10
    Comment: yes
5. Did I format the variable names properly (in lowerCamelCase)? 
    Mark out of 10: 10
    Comment: yes
6. Did I indent the code appropriately? 
    Mark out of 10: 10 
	   Comment: 			yes
7. Did I use an appropriate for loop to test all possibilities?  There should be only one. 
    Mark out of 20: 20
    Comment: yes 
8. Did I correctly check if people alive today were or could be alive in a year that is the square of their age in that year. 
    Mark out of 30: 30
    Comment: yes
9. How well did I complete this self-assessment? 
    Mark out of 5: 5
    Comment: good
Total Mark out of 100 (Add all the previous marks): 
*/ 

public class SquareAge {
	
	final static int CURRENT_YEAR = 2018; 
	final static int MAX_AGE = 123;
	final static int MIN_AGE = 0;
	final static int MAX_YEAR = CURRENT_YEAR + 123;
	final static int MIN_YEAR = CURRENT_YEAR - 123;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age, squareOfAges;
		for (age = MIN_AGE; (age <= MAX_AGE); age++)
		{
			squareOfAges = age*age;

			if(squareOfAges >= MIN_YEAR + age && squareOfAges <= MAX_YEAR - age)

				System.out.println( "A person of age " +age + " will be the square of their age in the year "+squareOfAges);
		}

	}

}
