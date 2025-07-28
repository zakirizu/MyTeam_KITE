package Aman_Java_Questions;

import java.util.HashMap;

public class Count_Characters {

	public static void main(String[] args) {
		String str = "aaabbcccdd";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i =0; i <str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if (map.containsKey(ch)) {
				
				map.put(ch, map.get(ch) + 1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
	     for (Character key : map.keySet()) 
	     {
	    	 System.out.println(key + ":" + map.get(key) + " ");
	     }
		
	}
				
				
				
}
			
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		

