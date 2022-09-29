package day6methodprog;

public class Constructor1 {
	Constructor1(){
		System.out.println("Zero parameter const");
	}
	Constructor1(int a){
		System.out.println("int parameter const");
	}

	Constructor1(char ch){
		System.out.println("char parameter const");
	}
	Constructor1(int a,double b){
		System.out.println("int-double parameter const");
	}
	Constructor1(double b,int a){
		System.out.println("double-int parameter const");
	}
	public void call() {
		System.out.println("non-static method");
	}
	public void print(int a) {
		System.out.println("non-static int method");
		System.out.println("display="+a);
	}


	public static void main(String[] args) {
		Constructor1 c1=new Constructor1('A');
		Constructor1 c2=new Constructor1(20);
	Constructor1 c3=new Constructor1(20.20,10);
	Constructor1 c4=new Constructor1();
c4.call();
c4.print(20);
}}
