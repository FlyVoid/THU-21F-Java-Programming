// Example for PPT page No.26

import java.util.Scanner;

public class TestScore3 {
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input=new Scanner(System.in);

		//Get the input
		System.out.printf("Enter an integer score: ");
		int score=input.nextInt();

		int GPA=(score>=95)?4:((score>=80)?3:((score>=70)?2:(score>=60)?1:0));

		//Display the result
		System.out.println("The GPA is: "+GPA);
    }
}