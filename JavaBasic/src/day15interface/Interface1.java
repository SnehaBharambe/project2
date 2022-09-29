package day15interface;

 class Parent5 {
	void show() {
		System.out.println("Parent's show()");
	}
}
class Child5 extends Parent5 {
	// This method overrides show() of Parent
	void show() {
		super.show();
		System.out.println("Child's show()");
	}
}
class GrandChild extends Child5 {
	// This method overrides show() of Parent
	void show() {
		super.show();
		System.out.println("GrandChild's show()");
	}
}
public class Interface1 {
	public static void main(String[] args) {
		GrandChild obj1 = new GrandChild();
		obj1.show();
		Parent5 o1=obj1;
		o1.show();
	}
}