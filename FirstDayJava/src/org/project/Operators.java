package org.project;

public class Operators {
	public static void main(String[] args) {
		int i=23;
		int j=2;
		
		//&& logical operator ??? IF I WANT MY PROGRAM TO BE FAST , BECUASE IT WILL JUST CHECK THE 1ST CONDITION
		// & bitwise operator??? IF I WANT TO CHECK ALL THE CONDITIONS
		if (i==3 && j==2) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
	}
		
		if (i==3 & j==2) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
	}
		
		if (i==3 || j==2) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
	}
		if (i==3 | j==2) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
	}
		

}
}
