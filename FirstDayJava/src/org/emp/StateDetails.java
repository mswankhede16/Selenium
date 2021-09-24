package org.emp;

public class StateDetails {
	private void southIndia() {
		System.out.println("south");
		// TODO Auto-generated method stub

	}
	private void northIndia() {
		System.out.println("north");
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		LanguageInfo li= new LanguageInfo();
		li.englishLanguage();
		li.hindiLanguage();
		li.tamilLanguage();
		
		
		
		StateDetails sd= new  StateDetails();
		sd.northIndia();
		sd.southIndia();
		
	}

}
