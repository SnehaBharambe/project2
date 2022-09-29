package assignment;

public class Palindrome {
	 int number() {
		return 121;
	}

	public static void main(String[] args) {
		 int num,a,b,rem;
		 Palindrome  p1=new Palindrome ();
System.out.println("Enter any number ");
       num=p1.number();
a=num;
for(b=0;num>0;num/=10)
{
rem=num%10;
b=(b*10)+rem;
}
if(b==a)
System.out.println(a+" is a palindrome number ");
      else
System.out.println(a+" is not a palindrome number ");
      
}
}