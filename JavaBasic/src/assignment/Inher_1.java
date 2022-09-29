package assignment;
class keyWord{
	int empId;
	char ch;
	keyWord(int empId,char ch){
		this.empId=empId;
		this.ch=ch;
		}
	keyWord(){
		 
	}
		public void call() {
			System.out.println("method body for parent");
		}
		public void call(int a) {
			this.call();
			System.out.println("method body for parameter");
		}	
		
	}
	class Word extends keyWord{
		
		float salary;
		Word(int empId,char ch,float salary){
			super(empId,ch);
			this.salary=salary;
		}
		public void call() {
			super.call();
			System.out.println("method body for word");
		}

		public void print() {
			System.out.println("The empId is:"+empId);
			System.out.println("The name is:"+ch);
			System.out.println("The salary is:"+salary);
		}
	}
	

public class Inher_1 {
	public static void main(String[] args){ 
		Word w1=new Word(121,'A',25000f);
		w1.print();
		w1.call();
	}

}



