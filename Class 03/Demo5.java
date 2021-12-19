// Example for PPT page No.19

public class Demo5 {
	public static void main(String[] args) {
		// Create the original array (a) and the destination array (b)
		int[] a={0,1,2,3,4,5,6,7,8,9};
		int[] b=new int[a.length];
		
		// Copy from a[0] to b[1] with 3 elements
		System.arraycopy(a,0,b,1,3);
		
		// Display the original array and the destination array
		for(int i=0;i<a.length;i++) {
			System.out.printf("%3d",a[i]);
		}
		System.out.println();
		
		for(int i=0;i<b.length;i++) {
			System.out.printf("%3d",b[i]);
		}
		System.out.println();
	}
}