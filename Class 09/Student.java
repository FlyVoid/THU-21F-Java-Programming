// Example for PPT Page No.28
import java.util.*;

public class Student {
	private ID id;
	private String name;
	private char gendar;
	private String university;
	private HashMap<String, String> properties;
	
	public Student() {
		properties=new HashMap<>();
	}
	
	public Student(ID id, String name, char gendar, String university) {
		this();						// for the hash map
		this.id=id;
		this.name=name;
		this.gendar=gendar;
		this.university=university;
	}
	
	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id=id;
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
	
	public String getUniversity() {
		return this.university;
	}
	
	public void setUniversity(String university) {
		this.university=university;
	}
	
	public String getProperties(String key) {
		return this.properties.get(key);
	}
	
	public void setProperties(String key, String value) {
		this.properties.put(key, value);
	}

	// convert the hash map to tree map (sorted)
	public void listProperties() {
		TreeMap<String, String> treeMap=new TreeMap<>(this.properties);
		System.out.println(treeMap);
	}

	public String toString() {
		return "\n学号："+this.id.toString()+"\n姓名："+this.name+"\n性别："+(this.gendar=='M'?"男":"女")+"\n学校："+this.university;
	}
}