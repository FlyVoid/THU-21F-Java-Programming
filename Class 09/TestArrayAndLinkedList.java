// Example for PPT Page No.20
import java.util.*;

public class TestArrayAndLinkedList {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1); // 1 is autoboxed to new Integer(1)
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(0, 10);
		arrayList.add(3, 30);

		System.out.println("A list of integers in the array list:");
		System.out.println(arrayList);
		System.out.println();

		LinkedList<Object> linkedList = new LinkedList<>(arrayList);
		linkedList.add(1, "red");
		linkedList.removeLast();
		linkedList.addFirst("green");

		System.out.println("Display the linked list:");
		for (int i = 0; i< linkedList.size(); i++) {
			System.out.print(linkedList.get(i) + " ");
		}
		System.out.print("\n\n");
		
		System.out.println("Display the linked list backward:");
		ListIterator<Object> listIterator = linkedList.listIterator();
		listIterator = linkedList.listIterator(linkedList.size());
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous()+" ");
		}
	}
}