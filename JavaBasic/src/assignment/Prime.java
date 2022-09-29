package assignment;

public class Prime {
	static boolean object(int x) {
		if(x<=1)
			return false;
		for(int i=2;i< x;i ++)
			if(x % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		if(object(31))
			System.out.println("true");
		else
			System.out.println("false");
		if(object(55))
			System.out.println("true");
		else
			System.out.println("false");
	}
}








