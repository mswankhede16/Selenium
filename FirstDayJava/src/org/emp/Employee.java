package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee extends LanguageInfo{
	
	
	
	
	
	public void empName() {
		System.out.println("Manish");
		// TODO Auto-generated method stub

	}
	
	
	public static void main(String[] args) {
		Employee e= new Employee();
		e.empName();
		e.englishLanguage();//single Inheritance
		e.hindiLanguage();//single Inheritance
		e.tamilLanguage();
	
		Company c= new Company();
		c.companyName();
		
		Client cl= new Client();
		cl.clientName();
		
		Project p= new Project();
		p.projectName();
	}
	
	
	
	
	

}
