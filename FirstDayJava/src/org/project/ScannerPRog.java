package org.project;

import java.util.Scanner;

public class ScannerPRog {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//nextline - ctrl+2+ L // it will take the line
		System.out.println("ENter your name");
		String n= sc.nextLine();
		System.out.println(" Your name is: "+n);
		
		// next // it will just take 1st word
		System.out.println("ENter your name");
		String nt= sc.next();
		System.out.println(" Your name is :"+nt);
		
		
		// nextlong
		System.out.println("ENter your number is:");
		long l= sc.nextLong();
		System.out.println(" Your name is :"+l);
		
		//nextfloat
		
		System.out.println("ENter avg value");
		float ft= sc.nextFloat();
		System.out.println(" Your avg value is :"+ft);
		
		//nextDouble
		System.out.println("ENter your salary");
		double db= sc.nextDouble();
		System.out.println(" Your salary is :"+db);
		
		//nextBoolean
		System.out.println("ENter your value");
		boolean boo= sc.nextBoolean();
		System.out.println(" Your boo value is :"+boo);
		
		
				
		
				
	}
	
	

	

}
