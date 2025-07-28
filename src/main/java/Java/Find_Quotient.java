package Java;

public class Find_Quotient {

	public static void main(String[] args) {

		int n = 1245;
		int sum = 0 ;

		while (n > 0) 
		{
			int q = n / 10;
			int r = n % 10;

			n = q;

			// System.out.println("Q"+q);
			   System.out.println("R" + r);
			   sum = sum + r;
			   System.out.println("Sum "+sum);

		}
	
		
		while(sum>9)
		{
		int q = sum / 10;
		int r = sum % 10;
		sum = q + r;
		
		}
         
		System.out.println("Sum of All Numbers is"+sum);
		
		
	}

}
