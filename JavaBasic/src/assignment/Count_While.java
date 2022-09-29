package assignment;

public class Count_While {
	static int digit(long x) {
		int count=0;
		while(x != 0) {
			x = x /10;
			count++;
		} 
		return count;
	}

	public static void main(String[] args) {
		long x=12345678;
		System.out.println("Number of digits :"+digit(x));

	}

}
