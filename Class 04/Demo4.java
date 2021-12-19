// Example for PPT page No.13

public class Demo4 {
	public static void main(String[] args) {
		String message=new String("Hello World!");
		char[] charArray={'H','e','l','l','o',' ','W','o','r','l','d','!'};
		
		charArray[0]='A';
		
		System.out.println(message);
		System.out.println(charArray);
		
		System.out.println(message.length());
		System.out.println(charArray.length);
	}
}