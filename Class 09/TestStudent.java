// Example for PPT Page No.28
public class TestStudent {
	public static void main(String[] args) {
		Student[] students=new Student[6];
		
		students[0]=new Student(new ID(201),"张三",'M',"清华大学");
		students[0].setProperties("出国交换","MIT");
		students[0].setProperties("专业","信息管理与信息系统");
		students[0].setProperties("文体特长","射击");

		students[1]=new Student(new ID(211),"李四",'F',"北京大学");
		students[1].setProperties("专业","应用经济");
		students[1].setProperties("出国交换","伦敦经济学院");
		students[1].setProperties("实习","香港中银国际");
		students[1].setProperties("第二学位","国际关系");

		students[2]=new Student(new ID(214),"王五",'F',"中国人民大学");
		students[2].setProperties("专业","人力资源");

		students[3]=new Student(new ID(221),"赵六",'M',"北京航空航天大学");
		students[3].setProperties("生源所在地","上海");
		students[3].setProperties("学位","博士");

		students[4]=new Student(new ID(237),"陈七",'M',"北京邮电大学");
		students[4].setProperties("实习","中国电信");

		students[5]=new Student(new ID(256),"钱八",'M',"北京理工大学");
		students[5].setProperties("专业","理论力学");

		// traverse all students with their properties
		for (Student s: students) {
			System.out.println(s.toString());
			s.listProperties();
		}
		
		// search for the property
		searchStudent(students,"专业");
		searchStudent(students,"出国交换");
	}
	
	public static void searchStudent(Student[] students, String key) {
		System.out.println("\n具备 "+key+" 特点的学生有：");
		for (Student s: students) {
			if (s.getProperties(key)!=null) {
				System.out.println(s.toString());
				System.out.println(s.getProperties(key));
			}
		}
	}
}