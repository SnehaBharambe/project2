package assignment;

public class While_Palindrome {
	int r,temp,sum=0;
	int n=121;
	void palin() {
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Palindrome number");
		else
			System.out.println(" Non Palindrome number");
	}
	public static void main(String[] args) {
		While_Palindrome m1=new While_Palindrome();
		m1.palin();
	}

}

