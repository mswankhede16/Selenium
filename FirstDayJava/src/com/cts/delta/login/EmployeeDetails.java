package com.cts.delta.login;

public class EmployeeDetails {
	public void empName() {
		// TODO Auto-generated method stub
		System.out.println("java");

	}
	private void empId() {
		// TODO Auto-generated method stub
		System.out.println(564);

	}
	private void empLocation() {
		// TODO Auto-generated method stub
		System.out.println("SUsa");

	}
public static void main(String[] args) {
	EmployeeDetails ed =new EmployeeDetails();
	ed.empId();
	ed.empLocation();
	ed.empName();
	
	CourseDetails cdd = new CourseDetails();
	cdd.javaCourse();
}
}
