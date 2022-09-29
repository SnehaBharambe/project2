package assignment;

public class Factors {
 public void element(int a) {
	 for(int i=1;i<=a;++i)
		 if (a%i==0)
			 System.out.print(" "+i);
 }
	public static void main(String[] args) {
		Factors f1=new Factors();
		//int a=50;
		System.out.println("Factors of 50 is:");
		f1.element(50);
	}

}
