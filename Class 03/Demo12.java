// Example for PPT page No.31

import java.util.Scanner;
import java.util.Arrays;

public class Demo12 {
    public static void main(String[] args) {
        // Define the Scanner
		Scanner input=new Scanner(System.in);
		
		// Declare and create the array
		int[] array=new int[10];

		System.out.println("Please enter 10 elements of the original sorted array:");
		
        for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}

		// Prompt enter the key for search
		System.out.print("Please input the number for search: ");
		int key=input.nextInt();

		// Search the array for element key use the Arrays.binarySearch method
        int id=Arrays.binarySearch(array,key);

        if(id>=0) {
            System.out.println("Return "+id+" means that the Key ("+key+") is founded in array["+id+"]");
        }
        else {
            System.out.println("Return "+id+" means that the Key ("+key+") is not founded in array");
        }
    }
}