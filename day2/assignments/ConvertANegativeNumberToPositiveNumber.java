package week1.day2.assignments;

public class ConvertANegativeNumberToPositiveNumber {

	public void numconverttoPositive(int b) {
		// TODO Auto-generated method stub
          int num = b;
          
          if (num >= 0)
          {
        	  System.out.println("The provided number is Positive:"+" "+num);
          }
          
          else if(num < 0)
          {
        	  int updatednumber = num * (-1);
        	  System.out.println("The provided number is:"+" "+num+" "+"and the positive converted number is:"+" "+updatednumber);
          }
	}
	
	public static void main(String[] args) {
		
		ConvertANegativeNumberToPositiveNumber obj = new ConvertANegativeNumberToPositiveNumber();
		   obj.numconverttoPositive(5);
		
	}
}
