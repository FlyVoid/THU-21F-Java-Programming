// Example for PPT Page 21

public class Demo7 {
	public static void main(String[] args) {
		// Initialize the array a
		int[] a={1,2,3,4,5,6};
		
		// Display the original array
		System.out.print("Before the method, array a : ");
		for(int k: a) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		// Pass the arrayRefVar to the method
		method(a);
		
		// Display the array a after calling the method
		System.out.print(" After the method, array a : ");
		for(int j: a) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	public static void method(int[] b) {
		// Display array b before modify it
		System.out.print("  Before modified, array b : ");
		for(int k: b) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		// Modify elements in array b
		for(int i=0;i<b.length;i++) {
			b[i]+=1;
		}

		// Display array b after modify it
		System.out.print("   After modified, array b : ");
		for(int k: b) {
			System.out.print(k+" ");
		}
		System.out.println();
	}
}