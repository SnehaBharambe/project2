package day5methodprograms;

public class MethExa1 {
	static double getroi() {
		int p=25000,t=5;
		double r=6.5;
		double roi=(p*r*t)/100;
		System.out.println("Principle amount is="+p);
		System.out.println(" Interest is="+r);
		System.out.println("Time period is="+t);
		System.out.println("Rate of Interest is="+roi);
		return roi;
	}
		static double getroi(int p,int t,float r) {
			double roi=(p*r*t)/100;
			System.out.println("Principle amount is="+p);
			System.out.println(" Interest is="+r);
			System.out.println("Time period is="+t);
			System.out.println("Rate of Interest is="+roi);
			return roi;
		
	}
	
	

	public static void main(String[] args) {
		System.out.println("Program Starts");
		getroi();
		System.out.println("Interest to be paid is: "+getroi());
		double s=getroi();
		double finalamount=25000+s;
		System.out.println("Total amount ="+finalamount);
		
		System.out.println("*****using parameters*****");
		
		double x=getroi(30000,3,5.5f);
		double finalAmount=30000+x;
		System.out.println("Total amount ="+finalAmount);
		 
		x=MethExa1.getroi(65000,3,7.5f);
		finalAmount=65000+x;
		System.out.println("Total amount ="+finalAmount);
	}
}


