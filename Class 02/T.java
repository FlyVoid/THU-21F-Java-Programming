// Example for PPT page No.18

public class T {
	public static int k=4;
  
	public static void main(String[] args) {
		int i;
		i=say(k,5);
		System.out.println("Say "+i);
	}

	public static int say(int s1, int s2) {
		return s1+s2+k;
	}
}