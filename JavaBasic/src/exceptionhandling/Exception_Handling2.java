package exceptionhandling;

import java.util.Scanner;

public class Exception_Handling2 {

	public static void main(String[] args) {
		int i,j,k;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter first number:");
	i=scn.nextInt();
	System.out.println("Enter second number:");
	j=scn.nextInt();
	try {
		System.out.println("Inside try block");
		k=i/j;
		System.out.println("res:"+k);
		System.out.println("No Execution found");
	}catch(ArithmeticException obj){
		System.out.println("Inside catch() block");
		System.out.println("Exception handeled"+obj);
		obj.printStackTrace();
		
	}

   
	}
}
