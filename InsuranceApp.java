package PracticeQuestions;
import java.util.*;
import java.util.ArrayList;
public class InsuranceApp {
	
	static List<Insurance>l = new ArrayList<Insurance>();
	
	public static void main(String[] args) {
		
		l.add(new Insurance("Health","JeevanTharan",17000));
		l.add(new Insurance("Car","safeCar",13000));
		l.add(new Insurance("Life","lifeInsur",14000));
		l.add(new Insurance("Pet","petInsur",15000));
		l.add(new Insurance("Health","LongLive",16000));

		ArrayList<Insurance> arl = new ArrayList<>(l);
		
		System.out.println(InsuranceAnalysis.getInsuranceDetailsByCostAscending(arl));
		System.out.println(InsuranceAnalysis.totalPremiumCost(arl));
		
	}

}
