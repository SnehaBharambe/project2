package day3globalvariables;

public class StaticGlobalVariableExample4 {

	static int age=25;
	static boolean res;
	static char grade='B';
	static float roi;
	
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("defualt value of age is:"+StaticGlobalVariableExample4.age);
		System.out.println("defualt value of res is:"+StaticGlobalVariableExample4.res);
		System.out.println("defualt value of grade is:"+StaticGlobalVariableExample4.grade);
		System.out.println("defualt value of roi is:"+StaticGlobalVariableExample4.roi);
		System.out.println("**********************************");
		
		StaticGlobalVariableExample4.age=30;
		StaticGlobalVariableExample4.res=true;
		StaticGlobalVariableExample4.grade='A';
		StaticGlobalVariableExample4.roi=7.5f;
		System.out.println("updated value of age is:"+StaticGlobalVariableExample4.age);
		System.out.println("updated value of res is:"+StaticGlobalVariableExample4.res);
		System.out.println("updated value of grade is:"+StaticGlobalVariableExample4.grade);
		System.out.println("updated value of roi is:"+StaticGlobalVariableExample4.roi);
		
		
		System.out.println("Program Ends");
	}
}
