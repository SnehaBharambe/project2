package day10allinone;

//parent class
class Company {
	//global variable
	int num=30;
	double salary =300.40;

	
	//method with method overloading use of this keyword
	void display() {
		this.num=num;
		this.salary=salary;
		System.out.println("print display");
	}
	void display(int empID) {
		this.display();
		System.out.println("print empID"+empID);
		
	}


	void display(double roll) {
		this.display(39);
		System.out.println("print roll"+roll);
	}
	//constructor with overloading and use of this()
	Company() {
		System.out.println("constructor body 1");
		
	}
	Company(int age){
		this();
		System.out.println("constructor body:"+age);
		
	}
}

// child class of Company
class Employee extends Company {
	//global variable name as Company name variable
	int num=30;
	double salary =499.33;

	
		//method with method overloading use of this & super keyword
	void print1() {
		super.display(399.00);
		System.out.println("Print Method body");
	}
	void print1(int age) {
		this.print1();
		System.out.println("display:"+age);
	}
	
	
	
		//constructor with overloading and use of this() & super()
	Employee(){
		this(234);
		
		System.out.println("constructor body for empl");
	}
	
	Employee(double fee){
		super();
		System.out.println("display:"+fee);
	}
}

	
		

public	 class Inheritance6 {

	public static void main(String[] args) {
		
		//access all the above class members
		Employee e1 = new Employee();
		//Company p1 = e1;
		e1.display(300.33);
		e1.print1(29);
	}

}




