package Java;

public class Beta_OverRiding extends Alpha_Overloading {

	public static void main(String[] args) {
		

		Beta_OverRiding obj= new Beta_OverRiding ();
		
		obj.Addition("Aman",24);
	}

	   public static void Addition(String y , int x) {
			System.out.println("Child");
			System.out.println(y +" "+x);
		}


	

}
