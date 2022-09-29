package assignment;

public class Vowel {
	static void vowel(char x) {
		if(x== 'a' ||x== 'e'|| x=='i'|| x=='o' ||x=='u')
			System.out.println("The given alphabet is a vowel");
		else
			System.out.println("The given alphabet is a Consonant");
	}

	public static void main(String[] args) {
		vowel('a');
		vowel('d');
		Vowel.vowel('o');
		vowel('t');
	}

}
