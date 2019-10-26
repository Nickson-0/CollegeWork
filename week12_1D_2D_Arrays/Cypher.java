package week12_1D_2D_Arrays;

/* SELF ASSESSMENT

1. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)?

       Mark out of 5: 5
       Comment: my Variables are formatted in lowerCamelCase, the variable names are meaningful

2. Did I indent the code appropriately?

       Mark out of 5: 5 
       Comment: My code is indented

3. Did I write the createCipher function correctly (parameters, return type and function body) and invoke it correctly?

      Mark out of 20: 20 
       Comment: Yes the cypher peforms correctly, printout of cypher included.

4. Did I write the encrypt function correctly (parameters, return type and function body) and invoke it correctly?

      Mark out of 20: 20  
       Comment: My encrypt function is working correctly.

5. Did I write the decrypt function correctly (parameters, return type and function body) and invoke it correctly?

      Mark out of 20: 20   
       Comment: The decrypt fuction is working coorectly, it aims to perform the encrypt function backwards

6. Did I write the main function body correctly (repeatedly obtaining a string and encrypting it and then decrypting the encrypted version)?

      Mark out of 25: 25  
       Comment: the main body is written correctly

7. How well did I complete this self-assessment?

       Mark out of 5: 5
       Comment: made my best effort

Total Mark out of 100 (Add all the previous marks): 100

*/

import java.util.Random;
import java.util.Scanner;

public class Cypher {

	static char[] alphabetArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
			'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ' };
	static char[] cipherArray = alphabetArray.clone();

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);// .useDelimiter("\r");

		createCipher();

		// This can be commented out if you do not wish to display the cipher at the
		// start of the code
		System.out.println("-----------------------------------------------------");
		System.out.println("*This is the cipher, it can be deleted in the code.*");
		for (int i = 0; i < cipherArray.length; i++)
			System.out.print(cipherArray[i] + " ");
		System.out.println("");
		System.out.println("-----------------------------------------------------");

		while (true) {
			System.out.println("insert here any phrase you wish to encrypt and decrypt: ");

			String phraseInput = inputScanner.next().toLowerCase();
			phraseInput += inputScanner.nextLine().toLowerCase();

			char[] phraseArray = phraseInput.toCharArray();

			String encryptedString = encrypt(phraseArray);
			System.out.println("The encrypted word is: " + encryptedString);

			String decryptedString = decrypt(phraseArray);
			System.out.println("The decrypted word is: " + decryptedString);

			System.out.println("-----------------------------------------------------");
		}
	}

	public static void createCipher() {
		Random randomGen = new Random();

		for (int index = 0; index < cipherArray.length; index++) {
			int randomNumber = randomGen.nextInt(27);
			char temp = cipherArray[index];
			cipherArray[index] = cipherArray[randomNumber];
			cipherArray[randomNumber] = temp;
		}
	}

	public static String encrypt(char[] phraseArray) {

		for (int indexOfInput = 0; indexOfInput < phraseArray.length; indexOfInput++) {

			for (int index = 0; index < alphabetArray.length; index++) {

				if (phraseArray[indexOfInput] == alphabetArray[index]) {
					phraseArray[indexOfInput] = cipherArray[index];
					break;
				}
			}

		}
		return new String(phraseArray);
	}

	public static String decrypt(char[] phraseArray) {

		for (int index = 0; index < phraseArray.length; index++) {

			for (int indexOfInput = 0; indexOfInput < cipherArray.length; indexOfInput++) {

				if (phraseArray[index] == cipherArray[indexOfInput]) {
					phraseArray[index] = alphabetArray[indexOfInput];
					break;
				}
			}

		}
		return new String(phraseArray);
	}
}
