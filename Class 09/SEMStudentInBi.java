// Example for PPT Page No.28

public class SEMStudentInBi extends SEMStudent {
	private String summerProgram1;
	private String summerProgram2;
	private String summerProgram3;
	
	public SEMStudentInBi() {
	}
	
	public SEMStudentInBi(int studentId, String name, char gendar, String major, String address, String summerProgram1, String summerProgram2, String summerProgram3) {
		super(studentId, name, gendar, major, address);
		this.summerProgram1=summerProgram1;
		this.summerProgram2=summerProgram2;
		this.summerProgram3=summerProgram3;
	}
	
	public String getSummerProgram1() {
		return this.summerProgram1;
	}

	public void setSummerProgram1(String summerProgram1) {
		this.summerProgram1=summerProgram1;
	}

	public String getSummerProgram2() {
		return this.summerProgram2;
	}

	public void setSummerProgram2(String summerProgram2) {
		this.summerProgram2=summerProgram2;
	}

	public String getSummerProgram3() {
		return this.summerProgram3;
	}

	public void setSummerProgram3(String summerProgram3) {
		this.summerProgram3=summerProgram3;
	}
	
	public String toString() {
		super.toString();
		return "ÊîÆÚÏîÄ¿£º"+summerProgram1+"/"+summerProgram2+"/"+summerProgram3+"\n";
	}
}