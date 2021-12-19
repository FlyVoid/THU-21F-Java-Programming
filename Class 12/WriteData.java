// Example for PPT Page No.30
import java.io.*;

public class WriteData
{
	public static void main(String[] args) throws IOException
	{
		// Create a file for output
		File file=new File("WriteData.txt");
		if (file.exists())
		{
			System.out.println("File is already exists!");
			System.exit(1);
		}
		
		// Create a PriteWriter object
		PrintWriter output=new PrintWriter(file);
		
		// Write formatted data to the file
		output.println("张三 "+80);
		output.print("李四 ");
		output.println(85);
		output.print("王五");
		output.printf("%3d\n",90);
		
		// Close the file
		output.close();
	}
}