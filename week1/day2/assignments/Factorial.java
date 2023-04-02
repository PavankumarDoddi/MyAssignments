package week1.day2.assignments;

public class Factorial {
	
	public void factorialmethod(int a) {
		// TODO Auto-generated method stub
        int mul=1;
		System.out.println("The number provided to find the factoria is:"+a);
          for (int i=1; i<=a; i++)
          {
        	    mul = mul*i;
          }
          
          System.out.println("The factorial value of"+" "+a+"is"+" "+mul);
        
	}
	
	public static void main(String[] args) {
	
		Factorial obj = new Factorial();
		obj.factorialmethod(5);
	}

}
