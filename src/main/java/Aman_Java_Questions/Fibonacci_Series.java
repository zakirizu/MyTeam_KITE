package Aman_Java_Questions;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int n1=0,  n2=1,  n3, i, count=10;
		System.out.println(n1+" "+n2);
		
		for(i=2;i<count;++i);
		{
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
		
		}

}
