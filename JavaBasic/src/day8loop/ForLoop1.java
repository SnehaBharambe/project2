package day8loop;

public class ForLoop1 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; ++i) {
			System.out.println("******************* Hello i: " + i);
			for (int j = 0; j < 2; j++) {
				System.out.println("############### hi j: " + j);
				for (int k = 0; k < 2; k++) {
					System.out.println("bye k: " + k);
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			i = i + 1;
		}
		/*System.out.println("************Infinite loop**************");
		for (int i = 0; i >= 0; i++) {
			if ((i % 2 == 0)) {
				System.out.println(i);
			}
		*/}
	}

	

