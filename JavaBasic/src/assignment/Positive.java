package assignment;

public class Positive {
	static boolean negative(int num) {
		if (num> 0) {
			 System.out.println("POSITIVE NUMBER");
			return true;
		} else {
			System.out.println("NEGATIVE NUMBER");
			return false;
		}}

	public static void main(String[] args) {
		/**int num =24;{
			if (num> 0){
				System.out.println("positive NUMBER");
			} else {
				System.out.println("negative NUMBER");
			}*/
          System.out.println("Program Starts");
          System.out.println("The Given number is :"+negative(52));
          System.out.println("The Given number is :"+negative(-82));
          System.out.println("Program Ends");
          
	}

}
