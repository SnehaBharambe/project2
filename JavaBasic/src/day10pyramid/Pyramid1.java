package day10pyramid;

public class Pyramid1 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++){
		for (int j=0;j<=i;j++){
		System.out.print("* ");
		}
		System.out.println();
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(char i='a';i<'e';i++) {
			for(char j='a';j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		 
		for(int i=0;i<8;i=i+2) {
			for(int j=0;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=0;i<8;i=i+1) {
			if(i%2!=0) {
			for(int j=0;j<=i;j++) {
				
					
				
				System.out.print(i+" ");
			}
			System.out.println();
		
		}
		
		}}}
			
		/**for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}}*/
		
