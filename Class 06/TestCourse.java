// Example for PPT page No.19
import java.util.Scanner;

public class TestCourse {
	public static void main(String[] args) {
		// Create Scanner object
		Scanner input=new Scanner(System.in);
		
		// Create course object
		Course course=new Course(321022, "Programming in Java", 20);

		// Create student objects and add them into the course, which data file students.txt
		int numberOfStudent=input.nextInt();
		
		for (int i=0;i<numberOfStudent;i++) {
			String name=input.next();
			String majorIn=input.next();
			char gender=input.next().charAt(0);
			
			Student st=new Student(name,majorIn,gender);
			
			course.addParticipant(st);
		}

		// Display the course information
		course.displayCourse();
		
		// Delete student 3 and 1
		course.deleteParticipant(3);
		course.displayCourse();
		
		course.deleteParticipant(1);
		course.displayCourse();
	}
}