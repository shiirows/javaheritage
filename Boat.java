package javaheritage;

public class Boat extends Vehicle implements Stuff {
	
	public Boat() {
		super("Bmw", 500);
	}
	
	@Override
	public int kilometers() {
		// TODO Auto-generated method stub
		return 500;
	}

	@Override
	public String brand() {
		// TODO Auto-generated method stub
		return "Yachts";
	}

	@Override
	public String doStuff() {
		// TODO Auto-generated method stub
		return  "Je suis un " + brand() + "  et je fais glou glou !";
	}

}
