package day4globalvariables1;

public class NonStatic4 {
	int age;
	boolean res;
	char grade;
	

	public static void main(String[] args) {
		System.out.println("Progrm Starts");
		NonStatic4 r1=new NonStatic4();
		System.out.println("deafualt value of age="+r1.age);
		System.out.println("deafualt value of grade="+r1.grade);
		System.out.println("deafualt value of res="+r1.res);
		
		r1.age=20;
		r1. res=true;
		r1. grade='A';
		System.out.println("Upated value of age="+r1.age);
		System.out.println("Upated value of grade="+r1.grade);
		System.out.println("Upated value of res="+r1.res);
		
		NonStatic4 r2=new NonStatic4();
		System.out.println("deafualt value of age="+r2.age);
		System.out.println("deafualt value of grade="+r2.grade);
		System.out.println("deafualt value of res="+r2.res);
		
	}

}
