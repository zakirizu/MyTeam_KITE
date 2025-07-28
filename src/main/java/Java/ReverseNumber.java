package Java;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1626;
		int rev = 0;

		while (num > 0) {
			int digit = num % 10; // Reminder
			System.out.println(digit);
			rev = rev * 10 + digit;

			num = num / 10; // Qoutient
		}

		System.out.println("Reversed number: " + rev);
	}
}
