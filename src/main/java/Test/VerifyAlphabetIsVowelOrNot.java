package Test;

public class VerifyAlphabetIsVowelOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x = 'a';
		if (x != 'a' && x != 'e' && x != 'i' && x != 'o' && x != 'u') {
			System.out.println("Alphabet is Consonant: " + x);
		} else {
			System.out.println("Alphabet is Vowel: " + x);
		}
	}

}
