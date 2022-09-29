package assignment;

public class CountDigit {
	static int reverse=0,num=1254;
static void digit(long n) {
	for(;num !=0;num=num/10) {
		int rem=num % 10;
		reverse=reverse*10+rem;
	}
	System.out.println("The reverse number is:"+reverse);
}
	public static void main(String[] args) {
		digit(1254);

	}

}



