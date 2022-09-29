package day4globalvariables1;

public class NonStaticExample1 {
	int age;
	boolean res;
	double roi;
	
    public static void main(String[] args) {
    	NonStaticExample1 s1=new NonStaticExample1();
    	System.out.println("Program Starts");
    	System.out.println("the age is:"+s1.age);
    	System.out.println("the roi is:"+s1.roi);
    	System.out.println("the res is:"+s1.res);
    	
    	s1.age=30;
    	s1.res=true;
    	System.out.println("the age is:"+s1.age);
    	System.out.println("the roi is:"+s1.roi);
    	System.out.println("the res is:"+s1.res);
    	
    	System.out.println("Program Ends");
	    	

	}

}
