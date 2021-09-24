package org.tcs.billing;

import com.cts.delta.login.CourseDetails;
import com.cts.delta.login.EmployeeDetails;

public class ClientDetails {
	
	private void cName() {
		// TODO Auto-generated method stub
		System.out.println("Air");

	}
	private void cLocation() {
		System.out.println("Canada");
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		
		ClientDetails cl= new ClientDetails();
		cl.cLocation();
		cl.cName();
		
		CourseDetails cd= new CourseDetails();
		cd.javaCourse();
		
		EmployeeDetails ed= new EmployeeDetails();
		ed.empName();
				
	}

}
