import java.util.Scanner;

public class Try
{
	public static void main(String[] args)
	{
		// Declare scanner object
		Scanner input=new Scanner(System.in);
		
		// Prompt to enter 2 integers
		System.out.printf("Please input two integers:");
		
		int n1=input.nextInt();
		int n2=input.nextInt();
		
		System.out.println(n1+" * "+n2+" = "+(n1*n2));
	}
}