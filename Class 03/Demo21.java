// Example for PPT page No.52
import java.util.Scanner;
import java.util.Arrays;

public class Demo21 {
	public static void main(String[] args) {
		// Declare and create input scanner
		Scanner input=new Scanner(System.in);
		
		// Declare and read the arrays a1,a2
		int[] a1=new int[10];
		int[] a2=new int[10];
		
		for(int i=0;i<a1.length;i++) {
			a1[i]=input.nextInt();
		}

		// Read the key number for search
		int key=input.nextInt();
		
		arraySort(a1);
		arraySearch(a1,key);
		arrayFill(a2,1,5,3);
		arrayEqual(a1,a2);
	}
	
	// Method for array sorting
	public static void arraySort(int[] a) {
		pr("Original a1",a);
		Arrays.sort(a);
		pr("Sorted   a1",a);
	}
	
	// Method for array search
	public static void arraySearch(int[] a,int k) {
		System.out.println("the result for search "+k+" in a1 is :"+Arrays.binarySearch(a,k));
	}
	
	//Method for fill the elements
	public static void arrayFill(int[] a, int begin, int end, int value) {
		pr("Original a2",a);
		Arrays.fill(a,begin,end,value);
		pr("Filled   a2",a);
	}
	
	// Method for compare the two arrays
	public static void arrayEqual(int[] a, int[] b) {
		System.out.println("The two arrays are");
		pr("a1",a);
		pr("a2",b);
		
		System.out.println("The result for equal test of the two arrays is: "+Arrays.equals(a,b));
	}
	
	
	// Display elements in array
	public static void pr(String s,int[] b)	{
		System.out.printf(s+" is:\t");
		for(int k: b) {
			System.out.printf("%3d",k);
		}
		System.out.println();
	}
}