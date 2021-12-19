// Example for PPT page No.12

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		// Define the system input, and read the number for k
		Scanner input=new Scanner(System.in);

		System.out.print("Input an integer: ");
		int k=input.nextInt();
		
		// Call method sayHello() in class Test
		Test.sayHello("Hi");
		
		// Invoke method Square() in class Test				
		System.out.println("The square of "+k+" is: "+Test.Square(k));
	}
}