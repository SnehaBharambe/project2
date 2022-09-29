package day3globalvariables;

public class StaticGlobalVariableExample5 {
	static int num1=50,num2,res;

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("Program Starts");
        res=num1+num2;
		System.out.println("Number 1 is :"+num1);
		System.out.println("Number 2 is :"+num2);
		System.out.println("Result is ="+res);
		
		num2=25;
		res=num1+num2;
		System.out.println("Number 1 is :"+num1);
		System.out.println("Updated Number 2 is :"+num2);
		System.out.println("Updated Result is ="+res);
		
		num1=86;num2=52;
		res=num1-num2;
		System.out.println("Updated Number 1 is :"+num1);
		System.out.println("Updated Number 2 is :"+num2);
		System.out.println("Updated Result is ="+res);
		
		
		System.out.println("Program Ends");


	}

}
