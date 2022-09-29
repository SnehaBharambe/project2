package day6methodprog;

public class NSExample2 {
	int num=55;
	public void project() {
	System.out.println("I am project() and num value is="+num);
	}
	public void project(int a) {
		int num=a;
		System.out.println("I am project(int) and num value is="+num);
		}


	public static void main(String[] args) {
		System.out.println("Program Starts");
		NSExample2 d1=new NSExample2();
	 	System.out.println("num="+d1.num);
	 	d1.project() ;
	 	d1.project(25); 
	 	
	 	NSExample2 d2=new NSExample2();
	 	System.out.println("num="+d2.num);
	 	d2.project(60); 
	   	System.out.println("Program Ends");

	}

}
