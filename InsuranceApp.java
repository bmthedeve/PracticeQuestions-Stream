package PracticeQuestions;
import java.util.*;
import java.util.ArrayList;
public class InsuranceApp {

	public static void main(String[] args) {
		Insurance i1=new Insurance("Health","JeevanTharan",17000);
		Insurance i2=new Insurance("Car","safeCar",13000);
		Insurance i3=new Insurance("Life","lifeInsur",14000);
		Insurance i4=new Insurance("Pet","petInsur",15000);
		Insurance i5=new Insurance("Health","LongLive",16000);
		
		ArrayList<Insurance>l = new ArrayList<Insurance>();
//		List<Insurance>l = Arrays.asList(i1,i2,i3,i4,i5);
		l.add(i1);
		l.add(i2);
		l.add(i3);
		l.add(i4);
		l.add(i5);
//		System.out.println(l);
		
//		public static Integer totalPremium(ArrayList<Insurance> l) {
//			
		ArrayList<Insurance> li = InsuranceAnalysis.getInsuranceDetailsByCostAscending(l);
		System.out.println(li);
	}

}
