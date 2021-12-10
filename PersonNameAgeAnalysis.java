package PracticeQuestions;
import java.util.*;
public class PersonNameAgeAnalysis {
	//return the count of persons above the age specified
			public static int getPersonsAboveAge(int n, List<PersonNameAge> l) {
				return (int) l.stream().filter(o->o.getAge()>n).count();
			}
			
			//return age of Person with Maximum Age
			public static int getMaxAge(List<PersonNameAge> l) {
				return l.stream().max((o1,o2)->o1.getAge()-o2.getAge()).get().getAge();
			}
			
//			return List of Strings "<Name>:<Age>" of Persons whose age is in the range
//			public List<String> getPersonsInAgeRange(int upperAge, int LowerAge, List<PersonNameAge> l) {
//				return l.stream().filter(o->o.getAge()>LowerAge && o.getAge()<upperAge).forEach(o->System.out.println("<"+o.getName()+">:<"+o.getAge()+">"));
//			}
			
			public static void getPersonsInAgeRange(int upperAge, int LowerAge, List<PersonNameAge> l) {
				l.stream().filter(o->o.getAge()>LowerAge && o.getAge()<upperAge).forEach(o->System.out.println("<"+o.getName()+">:<"+o.getAge()+">"));
			}
}
