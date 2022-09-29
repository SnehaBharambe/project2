package assignment;

public class Reverse {
	static int num=123456,rev=0;
	static void digit() {
		for(;num !=0;num=num/10 ) {
			int remainder=num % 10;
			rev=rev*10+remainder;
			}
			System.out.println("The reverse number is:"+rev);
	}
	

	public static void main(String[] args) {
		
		System.out.println("The reverse number is:");
		digit();
	
	}}
		
		
	