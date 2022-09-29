package assignment;

public class EvenOdd {

	public static void main(String[] args) {
		int num = 682;
		if (num% 2 == 0){
			System.out.println("EVEN NUMBER");
		} else {
			System.out.println("ODD NUMBER");
		}
		evenodd(555);
		System.out.println("Given number is EVEN : " + evenodd(164));
		System.out.println("Given number is EVEN : " + evenodd(487));
		//way-3
		boolean res=evenodd(294);
		System.out.println("num status: "+res);
	}
	static boolean evenodd(int num) {
		if (num% 2 == 0) {
			 System.out.println("EVEN NUMBER");
			return true;
		} else {
			System.out.println("ODD NUMBER");
			return false;
		}
}}
