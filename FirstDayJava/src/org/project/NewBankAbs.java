package org.project;

public class NewBankAbs extends RBIabs{
	
	private void eduLoan() {
		System.out.println("8%");
		// TODO Auto-generated method stub

	}
	private void homeLoan() {
		System.out.println("9%");
		// TODO Auto-generated method stub

	}
	
	public void saving() {
		System.out.println("10%");
		// TODO Auto-generated method stub
	}
	@Override
	public void jointAcc2() {
		
		System.out.println("20%");
		
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void creditC() {
		System.out.println("30%");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		NewBankAbs na= new NewBankAbs();
		na.eduLoan();
		na.homeLoan();
		na.jointAcc2();
		na.creditC();
		
	}
	
	
	
	
}
