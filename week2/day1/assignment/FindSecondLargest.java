package week2.day1.assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		// Here is the input
				int[] data = {3,2,11,4,6,7};

				
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
			Arrays.sort(data);
			
			for (int i=0 ; i<data.length;i++)
			{
				//System.out.print(" "+data[i]);
				int j = data[data.length-2];
				if (data[i] == j)
						{
					        System.out.println(data[i]);
						}
			}
                
	}

}
