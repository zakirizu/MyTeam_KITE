package Aman_Java_Questions;

public class Swap_Strings {

	public static void main(String[] args) {
		
		String str1="Aman";
		String str2="Choubdar";
		//Before Swapping
        System.out.println("Before swapping:");
		System.out.println("str="+str1);
		System.out.println("str="+str2);
		//Concatenation 
		//Now Str1 is a combined String
		str1=str1+str2;
		//Now extract original Str1 and Assign Str2: 
		str2=str1.substring(0,str1.length()-str2.length());
		//Now extract Original str2 and Assign to str1:
        str1 = str1.substring(str2.length());
		//After Swapping
		System.out.println("After swapping:");
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
		
		
	}

}
