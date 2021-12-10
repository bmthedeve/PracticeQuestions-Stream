package PracticeQuestions;
import java.util.*;
public class PersonNameAge {
	private String name;
	private int age;
	
	
	public PersonNameAge(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonNameAge [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
