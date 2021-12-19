// Example for PPT page No.70

import java.util.Scanner;

public class TestScore00 {
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input=new Scanner(System.in);
		//Get the input
		System.out.printf("Enter an integer score: ");
		int score=input.nextInt();
		double GPA=0.0;
		String Grade="F";
	
		if(score>=95) {
			GPA=4.0;
			Grade="A";
		}
		if(score>=90&&score<95) {
			GPA=3.7;
			Grade="A-";
		}
		if(score>=85&&score<90)	{
			GPA=3.3;
			Grade="B+";
		}
		if(score>=80&&score<85)	{
			GPA=3.0;
			Grade="B";
		}
		if(score>=77&&score<80)	{
			GPA=2.7;
			Grade="B-";
		}
		if(score>=73&&score<77)	{
			GPA=2.3;
			Grade="C+";
		}
		if(score>=70&&score<73)	{
			GPA=2.0;
			Grade="C";
		}
		if(score>=67&&score<70)	{
			GPA=1.7;
			Grade="C-";
		}
		if(score>=63&&score<67)	{
			GPA=1.3;
			Grade="D+";
		}
		if(score>=60&&score<63)	{
			GPA=1.0;
			Grade="D";
		}
		if(score<60) {
			GPA=0.0;
			Grade="F";
		}


		//Display the result
		System.out.println("The GPA   is: "+GPA);
		System.out.println("The Grade is: "+Grade);
	}
}