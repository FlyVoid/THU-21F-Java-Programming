// Example for PPT page No.74

import java.util.Scanner;

public class DemoWhile {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		
		System.out.printf("Please input an integer: ");
		int number=input.nextInt();
		
		int sum=0;
		int i=1;
		
		while(i<=number) {
			sum=sum+i;
			i=i+1;
		}
		
		System.out.println("The summary is: "+sum);
	}
}		