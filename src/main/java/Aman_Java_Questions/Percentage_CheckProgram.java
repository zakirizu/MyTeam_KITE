package Aman_Java_Questions;

import java.util.Scanner;

public class Percentage_CheckProgram {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter percentage value: ");
		double percentage = sc.nextDouble();
		
		if(percentage >=80.0)
		{
			System.out.println("TRUE " + percentage +  "% is Passed");
		}
		else
		{
			System.out.print("False " + percentage + "% is Failed");
		}
	
	     sc.close();

	}

}
