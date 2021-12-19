// Example for PPT page No.46
import java.util.Scanner;

public class Demo17 {
	public static void main(String[] args) {
		// Create the input object
		Scanner input=new Scanner(System.in);
		
		// Prompt to input the rows and columns in array
		System.out.printf("Please input the rows and columns in this array:");
		
		int rows=input.nextInt();
		int columns=input.nextInt();
		
		// Declare and create the array
		int[][] array=new int[rows][columns];
		
		// Prompt to input the elements of the array
		System.out.println("Please input the elements of the array:");
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=input.nextInt();
			}
		}
		
		int[] rs=new int[rows];
		// Summarize the elements by rows
		for(int i=0;i<rows;i++) {
			int sum=0;
			for(int j=0;j<columns;j++) {
				sum+=array[i][j];
			}
			rs[i]=sum;
			System.out.println("The sum of row "+i+" is: "+sum);
		}

		int[] cs=new int[columns];
		// Summarize the elements by columns
		for(int j=0;j<columns;j++) {
			int sum=0;
			for(int i=0;i<rows;i++) {
				sum+=array[i][j];
			}
			cs[j]=sum;
			System.out.println("The sum of column "+j+" is :"+sum);
		}

		// Display the created array and sums
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("%4d",array[i][j]);
			}
			System.out.printf("|%4d\n",rs[i]);
		}
		
		System.out.println("-------------------");
		for(int j=0;j<cs.length;j++) {
			System.out.printf("%4d",cs[j]);
		}
		System.out.println();
	}
}