// Example for PPT page No.78

import java.util.Scanner;

public class DemoFor {
	public static void main(String args[]) 	{
		Scanner input=new Scanner(System.in);
		
		System.out.printf("Please input an integer: ");
		int number=input.nextInt();
		
		int sum=0;

		for(int i=1;i<=number;i++) {
			sum=sum+i;
		}
		
		System.out.println("The summary is: "+sum);
	}
}