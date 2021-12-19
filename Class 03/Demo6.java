// Example for PPT Page 19

public class Demo6 {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6};
		
		int[] b;
		
		b=a.clone();
		
		a[4]=0;
		b[2]=0;

		for(int i=0;i<a.length;i++) {
			System.out.printf("%2d",a[i]);
		}
		System.out.println();
		
		
		for(int i=0;i<b.length;i++) {
			System.out.printf("%2d",b[i]);
		}
		System.out.println();
	}
}