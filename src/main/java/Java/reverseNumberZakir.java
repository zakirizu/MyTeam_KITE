package Java;

public class reverseNumberZakir {

	public static void main(String[] args) {
		int n = 1626;
		int q=0;
		int r=0;
		int revNum = 0;
		
		while(n>0)
		{
			//Q
		 r = n%10;
		 q= n/10;
		 n=q;
		
			System.out.println(r);
			
			revNum = 10 * revNum + r;
			
			
		}
System.out.println("Rev Number is "+revNum);
		
		

	}

}
