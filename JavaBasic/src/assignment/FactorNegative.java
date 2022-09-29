package assignment;

public class FactorNegative {
	public void element(int a) {
		 for(int i=a;i<=-a;++i)
			// if(i==0) {
				// continue;
		//	 }
			// else {
		
			 if (-a%i==0)
				 System.out.print(" "+i);
	 }
		public static void main(String[] args) {
			Factors f1=new Factors();
			//int a=50;
			System.out.println("Factors of -50 is:");
			f1.element(-50);
		}

	}

