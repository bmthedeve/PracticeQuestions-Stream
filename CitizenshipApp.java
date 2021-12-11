//related to Citizenship Class, Person Class

package PracticeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CitizenshipApp {
	
	public static void main(String[] args) {
		
		Citizenship.addPerson(new Person(121,"A",34,null));
		Citizenship.addPerson(new Person(122,"B",23,null));
		Citizenship.addPerson(new Person(125,"C",76,null));
		Citizenship.addPerson(new Person(124,"D",34,null));
		Citizenship.addPerson(new Person(123,"E",34,null));
		
		ArrayList<Person> al =new ArrayList<>(Citizenship.hm.values());
		
		System.out.println(Citizenship.deletePersonById(121));
		Citizenship.showPersonDetailsByCategory("Young");
		System.out.println(Citizenship.countPersonAbove35(al));
		System.out.println(Citizenship.sortPersonOnAgeAsc(al));
		System.out.println(Citizenship.sortPersonOnAgeDesc(al));
	}
}