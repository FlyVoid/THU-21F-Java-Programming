// Example for PPT Page No.28

public class SEMStudent {
	private static int numberOfStudents;
	private int studentId;
	private String name;
	private char gendar;
	private String major;
	private String address;
	
	public SEMStudent() {
		this.numberOfStudents++;
	}

	public SEMStudent(int studentId, String name, char gendar, String major, String address) {
		this.numberOfStudents++;
		this.studentId=studentId;
		this.name=name;
		this.gendar=gendar;
		this.major=major;
		this.address=address;
	}
	
	public static int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public int getStudentID() {
		return this.studentId;
	}
	
	public void setStudentID(int studentId) {
		this.studentId=studentId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public char getGendar() {
		return this.gendar;
	}
	
	public void setGendar(char gendar) {
		this.gendar=gendar;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public void setMajor(String major) {
		this.major=major;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String toString() {
		System.out.println("---------------------------");
		System.out.println("学号为"+this.studentId+"同学的基本情况如下：");
		System.out.println("姓名："+this.name);
		if (this.gendar=='M') {
			System.out.println("性别：男");
		}
		else {
			System.out.println("性别：女");
		}
		System.out.println("专业："+this.major);
		System.out.println("住址："+this.address);
		
		return "\n";
	}
}