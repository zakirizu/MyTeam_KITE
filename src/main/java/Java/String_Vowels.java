package Java;

public class String_Vowels {

	public static void main(String[] args) {

		String name = "ChoubdarAman";
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (char vowel : vowels) {
			int count = 0;
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == vowel) {
					count++;
				}
			}
			if (count > 0) {
				
			System.out.println(vowel + "  " + count);
			}
		}

	}
}