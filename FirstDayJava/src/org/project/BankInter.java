package org.project;

public class BankInter implements FirstIn, I2 {
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
	public void bank1() {
		System.out.println("bank1%");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void bank2() {
		System.out.println("bank2%");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void bank3() {
		System.out.println("bank3%");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		BankInter bi= new BankInter();
		bi.eduLoan();
		bi.homeLoan();
		
		bi.bank1();
		bi.bank2();
		bi.bank3();
		
		
	}
	
	
}
