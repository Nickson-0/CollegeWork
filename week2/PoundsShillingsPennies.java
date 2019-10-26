package week2;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class PoundsShillingsPennies {
	
	public static final double OLDPENNY_VALUE = 0.67;
	public static final double OLD_SHILLING_VALUE = 8.04;
	public static final double OLD_POUND = 160.8;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = JOptionPane.showInputDialog("Enter number of old pennies, old shillings, old pounds seperated by spaces:");
		Scanner inputScanner = new Scanner( input );
		
		double oldPounds = inputScanner.nextDouble();
		double oldShillings = inputScanner.nextDouble();
		double oldPennys = inputScanner.nextDouble();
		
		inputScanner.close();
		
		double totalAmount = oldPounds*OLD_POUND + oldShillings*OLD_SHILLING_VALUE + oldPennys*OLDPENNY_VALUE;
		
		JOptionPane.showMessageDialog(null, "Your answer is £" + totalAmount);

		
	}

}
