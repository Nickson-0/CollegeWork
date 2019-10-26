package week6_errorhandling_nestedloops;

import java.util.Scanner;

public class SimpleExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.print("Enter a number: ");
		    Scanner inputScanner = new Scanner( System.in );
		    int number = inputScanner.nextInt();
		    int result = 100 / number;
		    System.out.println( "Result is " + result );
		}
		catch (ArithmeticException exception)
		{
		    System.err.printf ( "\nException thrown: %s\n", exception );
		}
	}

}




