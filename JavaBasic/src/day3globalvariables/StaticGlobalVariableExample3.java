package day3globalvariables;

public class StaticGlobalVariableExample3 {

	static int age;
	static boolean res;
	static char grade;
	static float roi;
	
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("defualt value of age is:"+StaticGlobalVariableExample3.age);
		System.out.println("defualt value of res is:"+StaticGlobalVariableExample3.res);
		System.out.println("defualt value of grade is:"+StaticGlobalVariableExample3.grade);
		System.out.println("defualt value of roi is:"+StaticGlobalVariableExample3.roi);
		System.out.println("**********************************");
		
		StaticGlobalVariableExample3.age=30;
		StaticGlobalVariableExample3.res=true;
		StaticGlobalVariableExample3.grade='A';
		StaticGlobalVariableExample3.roi=7.5f;
		System.out.println("updated value of age is:"+StaticGlobalVariableExample3.age);
		System.out.println("updated value of res is:"+StaticGlobalVariableExample3.res);
		System.out.println("updated value of grade is:"+StaticGlobalVariableExample3.grade);
		System.out.println("updated value of roi is:"+StaticGlobalVariableExample3.roi);
		
		
		System.out.println("Program Ends");
	}
}
