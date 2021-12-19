// Example for PPT page No.26

public class Demo9 {
	public static void main(String[] args) {
		int[] a={0,1,2,3,4,5,6,7,8,9};
		
		show(a);
		prt(a);
		prt(12,5,4,6);
		prt(-10,-3,-1);
		prt(1024);
	}
	
	public static void show(int[] b) {
		// for-each loop
		for(int k: b) {
			System.out.printf("%3d",k);
		}
		System.out.println();
	}
	
	// Variable-length argument list
	public static void prt(int... p) {
		for(int k: p) {
			System.out.printf("%3d",k);
		}
		System.out.println();
	}
}