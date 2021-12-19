// Example for PPT Page No.28
public class TestStudent {
	public static void main(String[] args) {
		Student[] students=new Student[6];
		
		students[0]=new Student(new ID(201),"����",'M',"�廪��ѧ");
		students[0].setProperties("��������","MIT");
		students[0].setProperties("רҵ","��Ϣ��������Ϣϵͳ");
		students[0].setProperties("�����س�","���");

		students[1]=new Student(new ID(211),"����",'F',"������ѧ");
		students[1].setProperties("רҵ","Ӧ�þ���");
		students[1].setProperties("��������","�׶ؾ���ѧԺ");
		students[1].setProperties("ʵϰ","�����������");
		students[1].setProperties("�ڶ�ѧλ","���ʹ�ϵ");

		students[2]=new Student(new ID(214),"����",'F',"�й������ѧ");
		students[2].setProperties("רҵ","������Դ");

		students[3]=new Student(new ID(221),"����",'M',"�������պ����ѧ");
		students[3].setProperties("��Դ���ڵ�","�Ϻ�");
		students[3].setProperties("ѧλ","��ʿ");

		students[4]=new Student(new ID(237),"����",'M',"�����ʵ��ѧ");
		students[4].setProperties("ʵϰ","�й�����");

		students[5]=new Student(new ID(256),"Ǯ��",'M',"��������ѧ");
		students[5].setProperties("רҵ","������ѧ");

		// traverse all students with their properties
		for (Student s: students) {
			System.out.println(s.toString());
			s.listProperties();
		}
		
		// search for the property
		searchStudent(students,"רҵ");
		searchStudent(students,"��������");
	}
	
	public static void searchStudent(Student[] students, String key) {
		System.out.println("\n�߱� "+key+" �ص��ѧ���У�");
		for (Student s: students) {
			if (s.getProperties(key)!=null) {
				System.out.println(s.toString());
				System.out.println(s.getProperties(key));
			}
		}
	}
}