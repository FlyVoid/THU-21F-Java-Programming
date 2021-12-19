// Example for PPT page No.1
import java.util.Scanner;

public class Demo2 {
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

		// Search the array for element key
        int id=binarySearch(array,key);

        if(id>=0) {
            System.out.println("Return "+id+" means that the Key ("+key+") is founded in array["+id+"]");
        }
        else {
            System.out.println("Return "+id+" means that the Key ("+key+") is not founded in array");
        }
    }
	
	public static int binarySearch(int[] a, int k) {
		// Initialize search the whole array
		int low=0;
		int high=a.length-1;
		
		while (high>=low) {
			int mid=(low+high)/2;
			
			if(k<a[mid]) {		// key may be in the first half
				high=mid-1;
			}
			else if(k==a[mid]) {// find the right key
				return mid; 
			}
			else {				// key may be in the second half
				low=mid+1;
			}
		}
		return -low-1;			// key is not founded, but find the right place for insert the key
	}
}