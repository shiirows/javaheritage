package javaheritage;

public abstract class Vehicle {
	
	private String brand;
	private int kilometers;
	
	public Vehicle(String brand, int kilometers) {
		this.brand = brand;
		this.kilometers = kilometers;
	}
	
	public abstract int kilometers();
	
	public abstract String brand();
	
	public abstract String doStuff();
	
	
	
	
	
	
	public String getbrand() {
		return brand;
	}
	
	public int getkilometers() {
		return kilometers;
	}
	

}
