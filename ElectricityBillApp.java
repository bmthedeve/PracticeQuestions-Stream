package PracticeQuestions;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ElectricityBillApp {
	
	static ElectricityBill arr[]=new ElectricityBill[5];
	
	public static void main(String[] args) {
		
		arr[0]= new ElectricityBill(122,LocalDate.of(2021, 06, 18),435);
		arr[1]= new ElectricityBill(123,LocalDate.of(2021, 06, 19),535);
		arr[2]= new ElectricityBill(124,LocalDate.of(2021, 06, 20),6235);
		arr[3]= new ElectricityBill(125,LocalDate.of(2021, 06, 21),1735);
		arr[4]= new ElectricityBill(126,LocalDate.of(2021, 06, 22),835);
		
		System.out.println(getLowestBillAmount());
		System.out.println(getHighestPaidBill());
		System.out.println(getAllBillsBasedOnCriteria());
		
	}
	
	public static int getLowestBillAmount() {
		return Arrays.stream(arr).min((o1,o2)->o1.getBillAmt()-o2.getBillAmt()).get().getBillAmt();
	}
	
	public static ElectricityBill getHighestPaidBill() {
		return Arrays.stream(arr).max((o1,o2)->o1.getBillAmt()-o2.getBillAmt()).get();
	}
	
	public static List<ElectricityBill> getAllBillsBasedOnCriteria() {
		return Arrays.stream(arr).filter(o->o.getBillAmt()>1001).collect(Collectors.toList());
	}
}
