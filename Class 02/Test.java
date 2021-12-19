// Example for PPT page No.12

public class Test {
	public static void main(String[] args) {
		int i=19;
		sayHello("Bye!");
		System.out.println("Square I is "+Square(i));
	}
	
	// Method with return value
	public static int Square(int j) {
		return j*j;
	}
	
	// Method without return value
	public static void sayHello(String s) {
		System.out.println(s+" from class Test");
	}
}