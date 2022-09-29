package day5methodprograms;

public class Test5 {
public static void print() {
	System.out.println("Zero parameter");
}public static void print(int a) {
	System.out.println("int parameter");
}
public static void print(int a,double b) {
	System.out.println("int-double parameter");
}
public  void print(double b,int a) {
	System.out.println("double-int parameter");
}

	public static void main(String[] args) {
		

Test5.print();
print(20);
Test5.print(50,101.22);
Test5 t1=new Test5();
t1.print(202.50,30);
	
	}

}
