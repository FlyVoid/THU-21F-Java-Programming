// Example for PPT page No.10
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        // Define the Scanner
		Scanner input=new Scanner(System.in);
		
		// Declare and create the array
		int[] array=new int[10];

		System.out.println("The original array is :");
		
        for(int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*100.0);
			System.out.printf("%4d",array[i]);
		}
		System.out.println();

		// Prompt enter the key for search
		System.out.print("Please input the number for search: ");
		int key=input.nextInt();

		// Search the array for element key
        int id=linearSearch(key,array);

        if(id!=-1) {
            System.out.println("Key ("+key+") is founded in array["+id+"]");
        }
        else {
            System.out.println("Key ("+key+") is not founded in array");
        }
    }

    public static int linearSearch(int k, int[] a) {
		// Compare the key with the elements in array by sequence
		for(int i=0;i<a.length;i++) {
            if(a[i]==k) {
				// key is found
                return i;
            }
        }

		// Finish searching and not founded key
        return -1;
    }
}
