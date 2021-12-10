package PracticeQuestions;
import java.util.*;
import java.util.stream.Collectors;
public class InsuranceAnalysis {
//	public int totalPremiumCost(ArrayList<Insurance> insurances) {
//		int sum = 0;
//	return insurances.stream().filter(o->o.getPremiumPerYear()>10000).map(o->o.getPremiumPerYear()).forEach(o->sum+=o);
//	}
	
	public static ArrayList<Insurance> getInsuranceDetailsByCostAscending(ArrayList<Insurance> l){
		List<Insurance> li = l.stream().sorted((o1,o2)->o1.getPremiumPerYear()-o2.getPremiumPerYear()).collect(Collectors.toList());
		ArrayList<Insurance> arl= new ArrayList<Insurance>(li);
		return arl;
	}
}
