// Example for PPT Page No.28
import java.util.*;

public class TestSEMStudent {
	public static void main(String[] args) {
		SEMStudent[] students=new SEMStudent[5];
		students[0]=new SEMStudent(2021010001,"张三",'M',"经济与金融","9#305");
		students[1]=new SEMStudentInBi(2021010002,"李四",'M',"信息管理与信息系统","9#405","网络爬虫","腾讯游戏","课程设计");
		students[2]=new SEMStudent(2021010003,"王五",'F',"信息管理与信息系统","紫荆5#203");
		students[3]=new SEMStudent(2021010004,"赵六",'M',"经济与金融","9#411");
		students[4]=new SEMStudentInBi(2021010005,"陈七",'F',"经济与金融","紫荆5#101","网络爬虫","美团分析","中金实习");
		
		System.out.println("经管学院共有"+SEMStudent.getNumberOfStudents()+"位同学");
		for (SEMStudent s: students) {
			System.out.println(s.toString());
		}
		
		System.out.println("其中信息管理与信息系统专业的学生如下：");
		LinkedList<SEMStudent> mgms=search(students, "信息管理与信息系统");
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