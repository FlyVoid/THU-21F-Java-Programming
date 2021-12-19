// Example for PPT Page No.28
import java.util.*;

public class TestSEMStudent {
	public static void main(String[] args) {
		SEMStudent[] students=new SEMStudent[5];
		students[0]=new SEMStudent(2021010001,"����",'M',"���������","9#305");
		students[1]=new SEMStudentInBi(2021010002,"����",'M',"��Ϣ��������Ϣϵͳ","9#405","��������","��Ѷ��Ϸ","�γ����");
		students[2]=new SEMStudent(2021010003,"����",'F',"��Ϣ��������Ϣϵͳ","�Ͼ�5#203");
		students[3]=new SEMStudent(2021010004,"����",'M',"���������","9#411");
		students[4]=new SEMStudentInBi(2021010005,"����",'F',"���������","�Ͼ�5#101","��������","���ŷ���","�н�ʵϰ");
		
		System.out.println("����ѧԺ����"+SEMStudent.getNumberOfStudents()+"λͬѧ");
		for (SEMStudent s: students) {
			System.out.println(s.toString());
		}
		
		System.out.println("������Ϣ��������Ϣϵͳרҵ��ѧ�����£�");
		LinkedList<SEMStudent> mgms=search(students, "��Ϣ��������Ϣϵͳ");
		System.out.println(mgms);
	}
	
	public static LinkedList<SEMStudent> search(SEMStudent[] students, String major) {
		LinkedList<SEMStudent> searchedStudent=new LinkedList<>();
		for(SEMStudent s: students) {
			if (s.getMajor().equals(major)) {
				searchedStudent.add(s);
			}
		}
		return searchedStudent;
	}
}