package day3globalvariables;

public class StaticGlobalVariableExample2 {

	static int age;
	static boolean res;
	static char grade;
	static float roi;
	
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("defualt value of age is:"+age);
		System.out.println("defualt value of res is:"+res);
		System.out.println("defualt value of grade is:"+grade);
		System.out.println("defualt value of roi is:"+roi);
		System.out.println("**********************************");
		
		age=30;
		res=true;
		grade='A';
		roi=7.5f;
		System.out.println("updated value of age is:"+age);
		System.out.println("updated value of res is:"+res);
		System.out.println("updated value of grade is:"+grade);
		System.out.println("updated value of roi is:"+roi);
		
		
		System.out.println("Program Ends");
	}
}
