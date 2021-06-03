package javaheritage;

public class Hangar {

	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.doStuff();
		
		
		Boat yachts = new Boat();
		yachts.doStuff();// TODO Auto-generated method stub

		
		System.out.println(yachts.doStuff() );
		System.out.println(bmw.doStuff());
	}

}
