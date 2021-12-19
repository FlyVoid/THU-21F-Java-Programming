// Example for PPT page No.46

import java.util.Scanner;

public class Demo18 {
	public static void main(String[] args) {
		// Declare and create input object
		Scanner input=new Scanner(System.in);
		
		int rows=input.nextInt();
		int columns=input.nextInt();
		
		// Declare the array;
		int[][] array=new int[rows][columns];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				array[i][j]=input.nextInt();
			}
		}
		
		// Define the first element is the minimize one
		int min=array[0][0];
		int r=0;
		int c=0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j]<min) {
					min=array[i][j];
					r=i;
					c=j;
				}
			}
		}
		
		// Display the result
		System.out.printf("The minimize elements is %d, and it is in (%d,%d).\n",min,r,c);
	}
}