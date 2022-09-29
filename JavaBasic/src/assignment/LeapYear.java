package assignment;

public class LeapYear {
	static boolean leap(int year) {
		if(year % 4==0) {
			System.out.println("LEAP YEAR");
			return true;
		}else {
				System.out.println("COMMON YEAR");
				return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Program Starts");
		leap(2030);
		System.out.println("Year is:"+leap(2020));
		System.out.println("Program Ends");
	}

}
