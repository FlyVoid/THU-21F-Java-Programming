// Example for PPT page No.69

import java.util.Scanner;

public class S {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.print("Input a number: ");

		int c=input.nextInt();

		switch(c) {
			case 1: System.out.println("Letter is A.");
					break;
			case 2: System.out.println("Letter is B.");
					break;
			case 3: System.out.println("Letter is C.");
					break;
			default: System.out.println("DDDDDD");
		}
	}
}