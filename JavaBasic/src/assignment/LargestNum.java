package assignment;

public class LargestNum {
	static int large(int x,int y,int z)
	{
		if(x >= y && x >= z)
			return x;
		
		else if(y >=x && y>=z)
			return y;
		
		else
			return z;
	}
	public static void main(String[] args) {
	int big;
	big=large(35,54,21);
	System.out.println("The Largest number is:"+big);

	}

}
