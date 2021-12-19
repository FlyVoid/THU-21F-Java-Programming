// Example for PPT page No.45

public class Demo16 {
	public static void main(String[] args) {
		int[][] array={{1,2,3},{4,5,6,7},{8,9}};
		
		// Display the elements of the array
		System.out.println("The array is:");
		
		// 显示任意一个二维数组的具体内容
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("%3d",array[i][j]);
			}
			System.out.println();
		}
/**
		for(int[] k: array) {
			for(int m: k) {
				System.out.printf("%3d",m);
			}
			System.out.println();
		}
*/
	}
}