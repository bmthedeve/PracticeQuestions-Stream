package PracticeQuestions;
import java.util.*;
public class PersonNameAgeApp {

	public static void main(String[] args) {
		PersonNameAge p1 = new PersonNameAge("A",23);
		PersonNameAge p2 = new PersonNameAge("B",28);
		PersonNameAge p3 = new PersonNameAge("C",29);
		PersonNameAge p4 = new PersonNameAge("D",36);
		PersonNameAge p5 = new PersonNameAge("E",65);
		
		List<PersonNameAge> al = Arrays.asList(p1,p2,p3,p4,p5);
		
		System.out.println(PersonNameAgeAnalysis.getMaxAge(al));
		System.out.println(PersonNameAgeAnalysis.getPersonsAboveAge(24, al));
		PersonNameAgeAnalysis.getPersonsInAgeRange(70, 25, al);

	}

}
