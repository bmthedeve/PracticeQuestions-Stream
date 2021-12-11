package PracticeQuestions;

import java.time.LocalDate;

public class ElectricityBill {
	private int bill;
	private LocalDate billDate;
	private int billAmt;
	
	public ElectricityBill(int bill, LocalDate billDate, int billAmt) {
		super();
		this.bill = bill;
		this.billDate = billDate;
		this.billAmt = billAmt;
	}
	
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public LocalDate getBillDate() {
		return billDate;
	}
	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}
	public int getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(int billAmt) {
		this.billAmt = billAmt;
	}
	
	@Override
	public String toString() {
		return "ElectricityBill [bill=" + bill + ", billDate=" + billDate + ", billAmt=" + billAmt + "]";
	}
	
	
}
