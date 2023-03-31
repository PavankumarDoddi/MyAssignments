package week1.day1.assignments;

public class Car {

	public void driveCar() 
	{
		System.out.println("You are in driveCar Method");
	}
	public void applyBrake()
	{
		System.out.println("You are in applyBreak Method");
	}
	public void soundHorn()
	{
		System.out.println("You are in soundHorn Method");
    }
	public void isPuncture() {
		// TODO Auto-generated method stub
        System.out.println("You are in isPuncture Method"); 
	}
	
	public static void main(String[] args) {
		
		Car jeep = new Car();
		jeep.driveCar();
		jeep.applyBrake();
		jeep.soundHorn();
		jeep.isPuncture();
	}
}
