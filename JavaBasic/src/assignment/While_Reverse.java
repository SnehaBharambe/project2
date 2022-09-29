package assignment;

public class While_Reverse {
	int num=456321,reverse=0;
	public  void change(long n) {
	while(num != 0)
	{
		int rem=num%10;
		reverse=reverse*10+rem;
		num=num/10;
		}
		
			
		
		System.out.println("The reverse number is="+reverse);
	
	}
	public static void main(String[] args) {
		 While_Reverse r1=new  While_Reverse();
		 r1.change(456321);

	}

}



