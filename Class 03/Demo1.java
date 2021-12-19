// Example for PPT page No.14
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		// Create the Scanner object
		Scanner input=new Scanner(System.in);
		
		// Prompt enter the length of the array
		System.out.print("Please input the length of the array: ");
		int length=input.nextInt();
		
		// Declare the array
		int[] array=new int[length];
		
		// Prompt enter the elements of the array
		System.out.print("PLease input the elements of the array: ");
		
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		
		// Find the maximum element
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
	
		// Print out the maximum element
		System.out.println("The maximum element is: "+max);
	}
}