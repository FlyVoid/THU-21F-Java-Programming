// Example for PPT page No.64, 70

import java.util.Scanner;

public class T {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.printf("Enter a number: ");

        int number=input.nextInt();

		boolean b=(number!=0)?true:false;

		if(b) {
			System.out.println("The number is not zero");
        }
		else {
			System.out.println("The number is zero");
        }
    }
}