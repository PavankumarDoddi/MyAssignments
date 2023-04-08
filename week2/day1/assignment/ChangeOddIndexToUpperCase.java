package week2.day1.assignment;

import org.apache.http.util.CharArrayBuffer;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		
		String test = "changeme";
		char[] carr = test.toCharArray();
		
		for (int i=0;i<carr.length;i++)
		{
			
			if(i%2 != 0)
			{
		        char uval = Character.toUpperCase(carr[i]);
				System.out.print(uval);
			}
			else
			{
				System.out.print(carr[i]);
			}
		}
	}
}
