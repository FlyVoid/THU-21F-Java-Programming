// Example for PPT Page No. 29
import java.io.*;
import java.util.Scanner;

public class ReadData
{
	public static void main(String[] args) throws Exception
	{
		// Create a File instance
		File file=new File("ReadData.txt");
	
		// Create a Scanner for the file
		Scanner input=new Scanner(file);
		
		// Read data from the file
		while(input.hasNext())
		{
			String name=input.next();
			int score=input.nextInt();
			
			System.out.println("Name: "+name+" Score: "+score);
		}

		// Close the file
		input.close();
	}
}