package week1.day2.assignments;

public class CheckIfTheNumberIsPositiveOrNegative {

	public void positiveOrNegative(int a) {
		// TODO Auto-generated method stub
          int num = a;
          
          if (a>0)
          {
        	  System.out.println("The number provided is Positive:"+" "+num);
          }
          else if(a==0)
          {
        	  System.out.println("The number provided is Zero:"+" "+num);
          }
          else
          {
        	  System.out.println("The number provided is Negative:"+" "+num);
          }
        		  
	}
	
	public static void main(String[] args) {
		
		
		CheckIfTheNumberIsPositiveOrNegative obj = new CheckIfTheNumberIsPositiveOrNegative();
		obj.positiveOrNegative(-98);
	}
}
