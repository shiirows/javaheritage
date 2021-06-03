package javaheritage;



public class Car extends Vehicle implements Stuff {
	
	public Car() {
		super("Bmw", 50);
		
	}

	@Override
	public int kilometers() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public String brand() {
		// TODO Auto-generated method stub
		return "BMW";
	}

	
	@Override
	public String doStuff() {
		// TODO Auto-generated method stub
		return "Je suis une " + brand() + " et je fais vroum vroum !";
	}

}
