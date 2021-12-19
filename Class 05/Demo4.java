// Example for PPT page No.17

public class Demo4 {
	public static void main(String[] argc) {
		// Declare and create the original array
		int[] array=new int[10];
		
		System.out.println("The original array is:");
		for(int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*100.0);
			System.out.printf("%4d",array[i]);
		}
		System.out.println();
		
		// Sort the array with selection sort
		selectionSort(array);
		
		// Output the result
		System.out.println("The result of selection sort is:");
		for(int k: array) {
			System.out.printf("%4d",k);
		}
		System.out.println();
	}
	
	public static void selectionSort(int[] list) {
		for(int i=0;i<list.length;i++) {
			int currentMin=list[i];
			int currentMinIndex=i;
			
			// Find the minimize element
			for(int j=i;j<list.length;j++) {
				if(currentMin>list[j]) {
					currentMin=list[j];
					currentMinIndex=j;
				}
			}
			
			// Swap, if needed
			if(currentMinIndex!=i) {
				list[currentMinIndex]=list[i];
				list[i]=currentMin;
			}
		}
	}
}