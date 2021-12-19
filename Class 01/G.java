// Example for PPT No.63

import java.util.Scanner;

public class G {
	public static void main(String[] args) {
		int day,answer;

		String set1=       //set 1
		  " 1  3  5  7\n"+
	  	  " 9 11 13 15\n"+
	  	  "17 19 21 23\n"+
	  	  "25 27 29 31\n";

		String set2=       //set 2
		  " 2  3  6  7\n"+
		  "10 11 14 15\n"+
		  "18 19 22 23\n"+
		  "26 27 30 31\n";

		String set3=       //set 3
		  " 4  5  6  7\n"+
		  "12 13 14 15\n"+
		  "20 21 22 23\n"+
		  "28 29 30 31\n";

		String set4=       //set 4
		  " 8  9 10 11\n"+
		  "12 13 14 15\n"+
		  "24 25 26 27\n"+
		  "28 29 30 31\n";

		String set5=       //set 5
		  "16 17 18 19\n"+
		  "20 21 22 23\n"+
		  "24 25 26 27\n"+
		  "28 29 30 31\n";

		Scanner input=new Scanner(System.in);

		day=0;

		// Prompt the user to answer questions
		System.out.print("\nIs your birthday in these numbers?\n"+set1+"(1-Yes, 0-No) :");
		answer=input.nextInt();
/*		if (answer==1) {
			day+=1;
		}
*/
		day+=1*answer;

		System.out.print("\nIs your birthday in these numbers?\n"+set2+"(1-Yes, 0-No) :");
		answer=input.nextInt();
/*		if (answer==1) {
			day+=2;
		}
*/
		day+=2*answer;

		System.out.print("\nIs your birthday in these numbers?\n"+set3+"(1-Yes, 0-No) :");
		answer=input.nextInt();
/*		if (answer==1) {
			day+=4;
		}
*/
		day+=4*answer;

		System.out.print("\nIs your birthday in these numbers?\n"+set4+"(1-Yes, 0-No) :");
		answer=input.nextInt();
/*		if (answer==1) {
			day+=8;
		}
*/
		day+=8*answer;

		System.out.print("\nIs your birthday in these numbers?\n"+set5+"(1-Yes, 0-No) :");
		answer=input.nextInt();
/*		if (answer==1) {
			day+=16;
		}
*/
		day+=16*answer;

		// Print your birthday
		System.out.println("\nYour birthday is "+day+" !");
	}
}