package week5_Iteration_While_DoWhile;

/* SELF ASSESSMENT 
1. Did I use easy-to-understand meaningful variable names? 
    Mark out of 10: 10
    Comment: yes 
2. Did I format the variable names properly (in lowerCamelCase)? 
    Mark out of 5: 5
    Comment: yes
3. Did I indent the code appropriately? 
    Mark out of 10: 10
    Comment: yes
4. Did I input the numbers one at a time from the command line?
    Mark out of 10:  10
    Comment: yes
5. Did I check the input to ensure that invalid input was handled appropriately?
    Mark out of 10:  10
    Comment: yes
6. Did I use an appropriate while or do-while loop to allow the user to enter numbers until they entered exit/quit?
    Mark out of 20:  20
    Comment: yes
7. Did I implement the loop body correctly so that the average and variance were updated and output appropriately?
    Mark out of 30: 30  
    Comment: yes
8. How well did I complete this self-assessment? 
    Mark out of 5:5 
    Comment: yes
Total Mark out of 100 (Add all the previous marks): 100 
*/

import java.util.Scanner;

public class AverageValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double variance = 0;
		double average = 0;
		double previousAverage = 0;
		double previousVariance = 0;
		double currentNumber = 0;
		int numberCount = 1;
		boolean finished = false;
		while (!finished){
			System.out.print("Enter a number (or exit)");
			Scanner input = new Scanner (System.in);
			if (input.hasNextInt()){
				double number = input.nextInt();
				currentNumber += number;
				
				average = ((previousAverage + (currentNumber - previousAverage)) / numberCount); 
				
				variance = (((previousVariance * (numberCount-1)) + ((currentNumber - previousAverage) * (currentNumber - average))) / numberCount);
				
				numberCount++;
				previousAverage += average;
				previousVariance += variance;
				
				System.out.println("So far the average is " + average + " and the variance is " + variance);
			}else if (input.hasNext("exit") || input.hasNext("quit"))
				finished = true;
				{	
				
				System.out.println("Thank you");
				}
		}
	}
}

	


