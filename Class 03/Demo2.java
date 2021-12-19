// Example for PPT page No.14
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] argc) {
		// Create the Scanner object
		Scanner input=new Scanner(System.in);
		
		// Prompt enter the length of the array
		System.out.print("Please input the length of the array:");
		
		int length=input.nextInt();
		
		// Create the array object
		double[] array=new double[length];
		
		// Initialize the elements of the array
		for(int i=0;i<array.length;i++) {
			array[i]=Math.random()*(double)length;
			System.out.printf("%6.2f",array[i]);
		}
		System.out.println();
		
		// Prompt enter the indexes of elements, and swap them
		System.out.print("Please enter the two indexes of elements for swap: ");
		int i1=input.nextInt();
		int i2=input.nextInt();
		
		double temp=array[i1];
		array[i1]=array[i2];
		array[i2]=temp;
		
		// Print the result for swap
		for(int i=0;i<array.length;i++) {
			System.out.printf("%6.2f",array[i]);
		}
		System.out.println();
	}
}