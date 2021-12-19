// Example for PPT Page No.20
import java.util.*;

public class LinkedListSort {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		LinkedList<Integer> data=new LinkedList<>();
		
		while (input.hasNext()) {
			data.addLast(input.nextInt());
		}
		System.out.println("Original data:\n"+data);
		
		LinkedList<Integer> sortedData=sort(data);
		System.out.println("Sorted data:\n"+sortedData);
	}
	
	public static LinkedList<Integer> sort(LinkedList<Integer> data) {
		LinkedList<Integer> sorted=new LinkedList<>();
		
		ListIterator<Integer> iterator=data.listIterator();
		while (iterator.hasNext()) {
			int key=iterator.next();
			
			int i=0;
			for(;i<sorted.size();i++) {
				if (key<sorted.get(i)) {
					break;
				}
			}
			sorted.add(i,key);
		}
		return sorted;
	}
}