package com.cts.delta.login;

public class CourseDetails {

	
	public void javaCourse() {
		
		System.out.println("JAva");

	}
	
	private void oracleCourse() {
		System.out.println(" Or");

	}
	private void seleniumcourse() {
		System.out.println(" Sele");

	}
	public static void main(String[] args) {
		//CReate a object classname objectname= new classname
		CourseDetails cd= new CourseDetails();
		
		// call the methods
		cd.oracleCourse();
		cd.javaCourse();
		cd.seleniumcourse();
		
		
		
	}
}
