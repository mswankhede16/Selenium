package org.project;

public class NewBank extends Rbi{
	
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
	public void checkingAcc() {
		System.out.println("11%");
		
	}
	
	public static void main(String[] args) {
		
		NewBank nb = new NewBank();
		nb.eduLoan();
		nb.homeLoan();
		
		
		nb.saving();
		nb.checkingAcc();
		
		nb.jointAcc();
		
	}
	
	
	

}
