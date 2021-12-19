// Example for PPT No.17

public class Demo4 {
	public static void main(String[] args) {
		// Initialize arrays
		int[] a={0,1,2,3,4,5,6,7,8,9};
		int[] b=new int[a.length];
	
		for(int i=0;i<a.length;i++) {
			a[i]=i;
		}

		// Copy elements from a to b
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}

		a[3]=-12;
	
		// Display elements in array a
		System.out.print("Array a: ");
		for(int k: a) {
			System.out.print(k+" ");
		}
		System.out.println();
	
		// Display elements in array b
		System.out.print("Array b: ");
		for(int k: b) {
			System.out.print(k+" ");
		}
		System.out.println();
	}
}