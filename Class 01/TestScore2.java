// Example for PPT page No.26

import java.util.Scanner;

public class TestScore2 {
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input=new Scanner(System.in);

		//Get the input
		System.out.printf("Enter an integer score: ");
		int score=input.nextInt();

		int GPA=0;
	
		if(score>=60) {
			GPA=1;
		}
		if(score>=70) {
			GPA=2;
		}
		if(score>=80) {
			GPA=3;
		}
		if(score>=95) {
			GPA=4;
		}

		//Display the result
		System.out.println("The GPA is: "+GPA);
    }
}