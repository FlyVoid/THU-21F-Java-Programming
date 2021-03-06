// Source code for exercise 2

import java.util.Scanner;

public class E_BinaryToDecimal {
	public static void main(String[] args) {
		// Prompt the user to enter a string
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a binary number string: ");
		String s = input.nextLine();
		System.out.println("The decimal value is " + binaryToDecimal(s));
	}

	public static int binaryToDecimal(String binaryString) {
		int value = binaryString.charAt(0) - '0';
		
		for (int i = 1; i < binaryString.length(); i++) {
			value = value * 2 + binaryString.charAt(i) - '0';
		}

		return value;
	}
}