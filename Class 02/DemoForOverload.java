// Example for PPT page No.16

import java.util.Scanner;

/** Demo program to show the overload of methods */
public class DemoForOverload {
	public static void main(String[] args) {
		// Define a scanner
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter the numbers for (I1,I2,I3,f1,f2): ");
		int i1=input.nextInt();
		int i2=input.nextInt();
		int i3=input.nextInt();
		float f1=input.nextFloat();
		float f2=input.nextFloat();
		
		System.out.println("The biggest for "+i1+" "+i2+" "+i3+" is: "+biggest(i1,i2,i3));
		System.out.println("The biggest for "+i1+" "+i2+" is: "+biggest(i1,i2));
		System.out.println("The biggest for "+f1+" "+f2+" is: "+biggest(f1,f2));
		System.out.println("The biggest for "+f1+" "+i2+" is: "+biggest(f1,i2));
		System.out.println("The biggest for "+i1+" "+f2+" is: "+biggest(i1,f2));
	}
	
	/** The overload methods for find the biggest number */
	public static int biggest(int i1,int i2,int i3) {
		if(i1>i2) {
			if(i1>i3) return i1;
			else return i3;
		}
		else {
			if(i2>i3) return i2;
			else return i3;
		}
	}
	
	public static int biggest(int i1,int i2) {
		if(i1>i2) return i1;
		else return i2;
	}
	
	public static float biggest(float f1,float f2) {
		if(f1>f2) return f1;
		else return f2;
	}
	
	public static float biggest(float f1,int i2) {
		if(f1>i2) return f1;
		else return (float)i2;
	}
	
	public static float biggest(int i1,float f2) {
		if(i1>f2) return (float)i1;
		else return f2;
	}
	
}