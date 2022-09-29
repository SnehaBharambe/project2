package day14arrays;

public class Array3 {

	public static void main(String[] args) {
		print();
	}
	static void print() {
		int a[]= {20,10,30,50};
		int b[]=new int[a.length];
		for (int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		//b[0]++;
		System.out.println("array a is");
for (int i=0;i<a.length;i++) {
	System.out.println(a[i]+" ");
	
}
System.out.println("array b is");
for (int i=0;i<b.length;i++) {
	System.out.println(b[i]+" ");
}}}