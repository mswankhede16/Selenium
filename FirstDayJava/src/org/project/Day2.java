package org.project;

import java.util.Scanner;

public class Day2 {
	
	public static void main(String[] args) {
		
		
		
		
		
		//2 digits
		byte age=25;
		
		
		System.out.println("Age value is "+ age);
		
		//4 digits
		short empid= 1234;
		System.out.println("empid is "+ empid);
		
		//9 digits
		int reno=123456789;
		Scanner sc= new Scanner(System.in);
		reno = sc.nextInt();
		System.out.println("reno is "+ reno);
		
		//>9 digits
		long phno=123456789123456789l;//l at the end is the syntax
		System.out.println("phno is "+ phno);
		
		float avg= 45.44f; //f at the end is the syntax
		System.out.println("avg is "+ avg);
		
		double salary= 4564562.4894163;
		System.out.println("salary is "+ salary);
		
		char block='c';
		System.out.println("block is "+ block);
		
		boolean status= true;
		System.out.println("status is "+ status);
		
		String mail= "gmail.com";
		System.out.println("mail is "+ mail);
		
	}

}
