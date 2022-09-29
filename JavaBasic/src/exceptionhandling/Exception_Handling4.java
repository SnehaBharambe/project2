package exceptionhandling;

import java.util.Scanner;

public class Exception_Handling4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=scn.nextInt();
		int[] empId=new int[size];
	try {	
		System.out.println("Inside try block");
		System.out.println(empId[4]);
		System.out.println("End try block");
	}catch(Throwable e) {
		System.out.println("Inside catch() block");
		System.out.println("Exception handled:"+e);
		e.printStackTrace();
		System.out.println("End try block");
	}
	}

}
