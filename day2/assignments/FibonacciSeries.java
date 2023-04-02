package week1.day2.assignments;

public class FibonacciSeries {
	
	public void fibonacci(int range) {
		// TODO Auto-generated method stub
       int a = 0;
       int b = 1;
       int sum;
       int rangeVal = range;
       System.out.print(a+" "+b);
       for (int i=1; i <= rangeVal; i++)
       {
    	  sum = a+b;
    	  System.out.print(" "+sum);
    	  a=b;
    	  b=sum;
    	  
       }
       
	}
	
	public static void main(String[] args) {
		
		FibonacciSeries obj = new FibonacciSeries();
	
		obj.fibonacci(8);
	}
}
