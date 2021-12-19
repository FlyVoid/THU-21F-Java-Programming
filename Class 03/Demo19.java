/** Example for PPT Page No.48 */
import java.util.Scanner;

public class Demo19 {
	public static void main(String[] args) {
		/** Declare and create Scanner object */
		Scanner input=new Scanner(System.in);
		
		/** Declare the students' answer and read from console */
		char[][] answer=new char[9][10];
		
		for(int i=0;i<answer.length;i++) {
			for(int j=0;j<answer[i].length;j++) {
				answer[i][j]=input.next().charAt(0);
			}
		}
		
		/** Declare and create the answer key */
		char[] key={'D','B','D','C','C','D','A','E','A','D'};
		
		/** Calculate and display each student's score */
		for(int i=0;i<answer.length;i++) {
			System.out.println("Student #"+i+"'s score is: "+calculate((answer[i]), key));
		}
	}
	
	/** Method for calculate the student's score */
	public static int calculate(char[] ans, char[] k) {
		int score=0;
		
		for(int j=0;j<ans.length;j++) {
			if(ans[j]==k[j]) {
				score+=10;
			}
		}
		
		return score;
	}
}