package assignment;

public class Swap {
static int c;
	public static void main(String[] args) {
	int a=62;
	int b=36;
	System.out.println("Program Start");
	System.out.println("Value of a before swipe="+a);
	System.out.println("Value of b before swipe="+b);
	
	c=a;
	a=b;
	b=c;
	
	System.out.println("Value of a after swipe="+a);
	
	System.out.println("Value of b after swipe="+b);
	
	System.out.println("Program Ends");
	}

}
