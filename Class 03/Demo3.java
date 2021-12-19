// Example for PPT page No.15
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		// Create the Scanner object
		Scanner input=new Scanner(System.in);
		
		// Prompt enter the length of the array
		System.out.print("Please input the length of the array: ");
		int length=input.nextInt();
		
		// Declare the array
		int[] array=new int[length];
		
		// Initialize the elements of the array
		for(int i=0;i<array.length;i++) {
			array[i]=i;
		}

		// Print the elements of the array with for-each cycle
		for (int k: array) {
			// It means: k=array[i]
			k++;
			k=k+100/k;
			System.out.print(k+" ");
		}
		System.out.println();
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}