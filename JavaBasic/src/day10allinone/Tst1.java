package day10allinone;



	class Demo {
		// Global Variable ---> Static and non-static global variable
		static int num;
		double salary;
		int age=25;
		Demo(){
			this(20);
			System.out.println("constuctor with zero parameter");
			System.out.println("age="+this.age);
		}
		Demo(int s){
			System.out.println("constuctor with int parameter");
			System.out.println("value of s="+s);
		}
		// blocks---> static and non-static block
		static {
			 num=20;
			System.out.println("static block");
		}
		{
			salary=54000.25;
			System.out.println("non-static block");
		}
		// method or function ---> can have static or non-static method with local variables
		public static void print1() {
			
			System.out.println("The value of num="+num);
			int empId=25;
			System.out.println("empId is="+empId);
		}
		public void call() {
			System.out.println("age is="+age);
		}
		//method overloading
		public  void call(int a) {
			System.out.println("value of a="+a);
			System.out.println("salary is="+salary);
		}
	}
	public class Tst1 {
		// Global Variable ---> Static and non-static global variable
		static int x=40;
		int age=30;
		// blocks---> static and non-static block
		static {
			System.out.println("static block of Tst1");
		}
		{
			System.out.println("non-static block of Tst1");
		}
		// method or function ---> can have static or non-static method with local variables
		static void display() {
			System.out.println("I am dispay of Tst1");
		}
		static void display(int p,int q) {
			System.out.println("I am display with int-int parameter");
		
		}
		void test() {
			System.out.println("body of non-static method");
		}
		//method overloading
		public static void main(String[] args) {
			
			//access all the members of ClassBody2 class		
			display();
			display(20,50);
			Tst1 obj=new Tst1();
			obj.test();
			//access all the members of Demo class
		
			Demo obj1=new Demo();
			Demo.print1();
			obj1.call();
			obj1.call(75);
			Demo d1=new Demo();
		
			
		}
	}