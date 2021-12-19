// Example for PPT page No.70

import java.util.Scanner;

public class TestScore1 {
	public static void main(String[] args)     {
		//Create a Scanner object
		Scanner input=new Scanner(System.in);

		//Get the input
		System.out.printf("Enter an integer score: ");
		int score=input.nextInt();

		int GPA;
		if(score>=95) {
			GPA=4;
		}
		else if(score>=80) {
			GPA=3;
		}
		else if(score>=70) {
			GPA=2;
		}
		else if(score>=60) {
			GPA=1;
		}
		else {
			GPA=0;
		}


		//Display the result
		System.out.println("The GPA is: "+GPA);
	}
}