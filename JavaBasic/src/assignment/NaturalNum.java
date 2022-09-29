package assignment;

public class NaturalNum {
	public int natural(int n) {
		int sum=0;
		for(int i=1; i<=n; i++)
			sum=sum+i;
		return sum;
		
	}

	public static void main(String[] args) {
		 NaturalNum d1=new  NaturalNum ();
		 int n=96;
		 System.out.println("Sum of natural number is="+d1.natural(n));

	}

}





