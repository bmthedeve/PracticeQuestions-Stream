//For defining methods

package PracticeQuestions;
import java.util.*;
import java.util.stream.Collectors;
public class InsuranceAnalysis {
	//If the premium per year is >10000, add it in the sum
	//If the premium per year is <10000, don't add it in the sum
	//If all the premium per year is <10000 return zero
	public static int totalPremiumCost(ArrayList<Insurance> insurances) {
		int sum = insurances.stream().filter(o->o.getPremiumPerYear()>10000).collect(Collectors.summingInt(Insurance::getPremiumPerYear));
		return sum;
	}
	
	public static ArrayList<Insurance> getInsuranceDetailsByCostAscending(ArrayList<Insurance> l){
		List<Insurance> li = l.stream().sorted((o1,o2)->o1.getPremiumPerYear()-o2.getPremiumPerYear()).collect(Collectors.toList());
		ArrayList<Insurance> arl= new ArrayList<Insurance>(li);
		return arl;
	}
}
