package PracticeQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
	
	static ArrayList<Employee> l = new ArrayList<Employee>();

	public static void main(String[] args) {
		
		l.add(new Employee(1001,"A",45000.25));
		l.add(new Employee(1002,"B",67000.50));
		l.add(new Employee(1003,"C",66000.25));
		l.add(new Employee(1004,"D",32000.40));
		l.add(new Employee(1005,"E",45000.48));
		l.add(new Employee(1006,"F",57000.32));
		
		System.out.println(getEmployeesBySalarySort(l));
		System.out.println(countEmployeesSalaryOfGivenRange(40000.23, 80000.50));

	}
	public static List<Employee> getEmployeesBySalarySort(ArrayList<Employee> al){
		return al.stream().sorted((o1,o2)->(int)o1.getSalary()-(int)o2.getSalary()).collect(Collectors.toList());
	}
	
	public static int countEmployeesSalaryOfGivenRange(double minRange, double maxRange) {
		return (int) l.stream().filter(o->o.getSalary()>minRange && o.getSalary()<maxRange).count();
	}

}
