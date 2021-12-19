// Example for PPT page No.24

public class Demo8 {
	public static void main(String[] args) {
		// Create original array (a)
		int[] a={0,1,2,3,4,5,6,7,8,9};
		
		// Return array from method reverse
		int[] b=reverse(a);
		
		// for-each loop
		for(int k: b) {
			System.out.printf("%3d",k);
		}
	}
	
	// Use array as the return value
	public static int[] reverse(int[] p) {
		// Create new array (r) for return
		int[] r=new int[p.length];
		
		for(int i=0;i<p.length;i++) {
			r[i]=p[p.length-1-i];
		}
		
		return r;
	}
}