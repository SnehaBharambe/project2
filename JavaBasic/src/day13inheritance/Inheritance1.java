package day13inheritance; 

class Student{
	int rollno,marks;
	char name;
	void input() {
		System.out.println("enter rollno and marks:");
	}
}
class Rocket extends Student{
	void display(){
		rollno=20;name='A';marks=85;
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		
Rocket r1=new Rocket();
r1.input();
r1.display();

	}

}
