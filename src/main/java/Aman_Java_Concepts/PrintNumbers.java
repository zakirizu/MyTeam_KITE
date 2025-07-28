package Aman_Java_Concepts;

public class PrintNumbers {

	public static void main(String[] args) {
		String s ="aman";
		System.out.println(s);
		char alp='a';
	
		int count =0;
		for(int i =0;i<s.length();i++) {
			if (s.charAt(i) == alp) {
				count++;
			}
		}
		System.out.println("The count of character a is :"+ count);
		
		

	}

}
