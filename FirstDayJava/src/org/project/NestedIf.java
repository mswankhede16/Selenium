package org.project;

public class NestedIf {
	public static void main(String[] args) {
		
		
		int a = 30, b= 29, c=26, d=1;
		if(a>b && a>c && a>d ) {
			System.out.println("A is Greater");
		}
		
		else if(b>a && b>c && b>d){
			System.out.println("B is Greater");
			
			
		}
		
		else if ( c>a && c>b && c>d) {
			System.out.println("C is Greater");
		}
		
		else {
			System.out.println("D is Greater");
		}
		
	}

}
