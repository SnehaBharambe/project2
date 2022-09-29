package assignment;

public class Division {
	static int a=87,b=23;
	public static void main(String[] args) {
		System.out.println("Program Start");
		System.out.println("First number is="+a);
		System.out.println("Second number is="+b);
		System.out.println("Quetient of a and b is="+div(a,b));
		System.out.println("modulus of a and b is="+a%b);
		System.out.println("Program Ends");
	}
public static int div(int x,int y) {
  return x/y;
}}
