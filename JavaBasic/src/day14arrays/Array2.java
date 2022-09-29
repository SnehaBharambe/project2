package day14arrays;

public class Array2 {

	public static void main(String[] args) {
		arr();
	}
		static void arr() {
		int[] num=new int[5];
		num[0]=20;
		num[1]=30;
		num[2]=40;
		num[3]=70;
		num[4]=50;
		System.out.println(num[1]);
		System.out.println(num[4]);
		    //or
		int[] n1= {10,50,70,20};
		System.out.println(n1[1]);
		System.out.println(num.length);
		System.out.println(n1.length);
		    //or
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		    //or
			for(int i:n1) {
				System.out.println(i);
			}
			
			int a=10;
			int b=20;
			int c=50;
			int[] x=new int[3];
			x[0]=20;
			x[1]=30;
			System.out.println(x[1]);
		}
	}

