package assignment;

public class Armstrong {
	static void arm() {
	int number = 371, InitialNumber, remainder, result = 0;
	 InitialNumber = number;
	 while (InitialNumber != 0) {
	  remainder = InitialNumber % 10;
	  result += Math.pow(remainder, 3);
	  InitialNumber /= 10;
	 }
	  if(result == number)
	   System.out.println(number + " is an Armstrong number."); 
	  else
	   System.out.println(number + " is not an Armstrong number.");
	}
	public static void main(String[] args) {
		arm();
		 }
		
	}


