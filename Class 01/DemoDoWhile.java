// Example for PPT page No.76

import java.util.Scanner;

public class DemoDoWhile {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		
		System.out.printf("Please input an integer: ");
		int number=input.nextInt();
		
		int sum=0;
		int i=1;
		
		do {
			sum=sum+i;
			i=i+1;
		} while(i<=number);
		
		System.out.println("The summary is: "+sum);
	}
}		