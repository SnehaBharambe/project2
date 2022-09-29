package day6methodprog;

class S{
	int i = 10;
	S() {
		System.out.println("Running Class S constructor..");
		System.out.println("Class A global varibale i = " + i);
	}
	void display() {
		System.out.println("I am display() of class S.");
	}
}
class X {
	int j = 10;
	X() {
		System.out.println("Running Class X constructor..");
	}
	void display() {
		System.out.println("I am display() of class X.");
	}
}
public class Const {
	void display() {
		System.out.println("I am display() of class Cons5.");
	}
	public static void main(String args[]) {
		System.out.println("Main() of Class Cons5 is started...");
		S a1 = new S();
		a1.display();
		System.out.println("Class S global varibale i = " + a1.i);
		X x1 = new X();
		x1.display();
		System.out.println("Class X global varibale j = " + x1.j);
		Const c1 = new Const();
		c1.display();
		System.out.println("Main() of Class Cons5 is ends here...");
	}
}
