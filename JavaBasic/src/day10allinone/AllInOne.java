package day10allinone;

public class AllInOne {

	
		//Global Variable ---> Static and non-static global variable
		static int num;
		double salary;
		
		//blocks---> static and non-static block
		static {
			num=55;
			System.out.println("static first block");
		}
		
		{
			salary=75000.42;
			System.out.println("non-static second block");
		}
		//constructor ----> can have overloading constructor
		AllInOne(){
			System.out.println("constructor with zero parameter");
		}
		AllInOne(int num1){
			System.out.println("constructor with int parameter");
		}
		// method or function ---> can have static or non-static method
		public static void call() {
			System.out.println("I am the call() of static method");
		}
		public void print() {
			System.out.println("I am the print() of non-static method");
		}
		public static void main(String[] args) {
			AllInOne obj=new AllInOne();
			System.out.println("salary="+obj.salary);
			AllInOne c1=new AllInOne();
			AllInOne c2=new AllInOne(25);
			call();
			c2.print();
			
		}
}

	


