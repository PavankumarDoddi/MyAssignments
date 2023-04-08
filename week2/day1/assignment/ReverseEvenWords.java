package week2.day1.assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
         
		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		 
	*/    	
		String test = "I am a software tester";
		String[] splitval = test.split(" ");
		int length = splitval.length;
		System.out.println(length);
		
		for(int i=0; i<=length-1;i++)
		{
			if (i%2 == 0)
			{
				char[] arr = splitval[i].toCharArray();
				
				for(int j=arr.length-1;j>=0;j--)
				{
					System.out.print(""+arr[j]);
				}
					
			}
			else
			{
				System.out.print(" "+splitval[i]+" ");
			}
		}
		
	}

}
