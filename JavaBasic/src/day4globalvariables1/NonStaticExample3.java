package day4globalvariables1;

public class NonStaticExample3 {
	int age=20;
	boolean res=true;
	float roi=4.6f;
	char grade='A';

	public static void main(String[] args) {
		NonStaticExample3 r1=new NonStaticExample3();
		System.out.println("Program Starts");
    	System.out.println("the age is:"+r1.age);
    	System.out.println("the roi is:"+r1.roi);
    	System.out.println("the res is:"+r1.res);
    	System.out.println("the grade is:"+r1.grade);
    	
    	r1.age=50;
    	r1.res=false;
    	r1.grade='C';
    	
    	System.out.println("the age is:"+r1.age);
    	System.out.println("the roi is:"+r1.roi);
    	System.out.println("the res is:"+r1.res);
    	System.out.println("the grade is:"+r1.grade);
    	
    	NonStaticExample3 r2=new NonStaticExample3();
    	System.out.println("default value of the age is:"+r2.age);
    	System.out.println("the roi is:"+r2.roi);
    	System.out.println("the res is:"+r2.res);
    	System.out.println("the grade is:"+r2.grade);
    	System.out.println("Program Ends");

	}

}
