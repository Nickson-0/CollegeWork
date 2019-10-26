package week3;

/* SELF ASSESSMENT 
1. Did I use easy-to-understand meaningful variable names?
  Mark out of 10: 10
Comment:They are easy to understand.
2. Did I format the variable names properly (in lowerCamelCase)? 
  Mark out of 10: 10
Comment: yes
3. Did I indent the code appropriately? 
  Mark out of 10: 10
Comment: yes
4. Did I read the input correctly from the user using appropriate questions? 
  Mark out of 20: 20
Comment: yes I carried out the task
5. Did I use an appropriate (i.e. not more than necessary) series of if statements? 
  Mark out of 30: 30
Comment: yes, code is very short.
6. Did I output the correct answer for each possibility in an easy to read format? 
  Mark out of 15: 15
Comment: yes 
7. How well did I complete this self-assessment? 
  Mark out of 5: 5
Comment: Excellently
Total Mark out of 100 (Add all the previous marks): 100 
*/

import  javax.swing.JOptionPane;

public class Umbrella {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer = JOptionPane.showConfirmDialog( null, "Is it raining?");
		boolean Rain = (answer == JOptionPane.YES_OPTION);

		if (Rain){ 
			JOptionPane.showMessageDialog( null, "Bring an umbrella and have it open.");
		}else{
			int answer2 = JOptionPane.showConfirmDialog( null, "Does it look like it's going to rain?");
			boolean noRain = (answer2 == JOptionPane.YES_OPTION);

			if (noRain){
				JOptionPane.showMessageDialog( null, "Bring an umbrella, but you may leave the umbrella closed.");
			}else{
				JOptionPane.showMessageDialog( null, "Do not bring an umbrella.");
			}
		}

	}

}
