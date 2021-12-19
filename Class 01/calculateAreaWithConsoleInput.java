import java.util.Scanner; //Scanner is in the java.util package

public class calculateAreaWithConsoleInput {
	public static void main(String[] args) {
		//create a Scanner object
		Scanner input=new Scanner(System.in);

		//prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius=input.nextDouble();

		//calculate the area
		double area=radius*radius*3.14159;

		//display the result
		System.out.println("The area for the circle of radius "+radius+" is "+area);
	}
}