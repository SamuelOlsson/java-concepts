package com.concepts.modifiers;

public class Vehicle {
	
	private Make carMake;
	public Integer year;
	private static Boolean isMyFavorite;
	public static Boolean parkingLocation;
	
	// Use all caps with underscore for final constants
	private final String VEHICLE_PLATES = "TEST"; 
	private final String VEHICLE_TYPE; 
	
	public Vehicle(Make carMake) {
		this.carMake = carMake;
		
		//Define directly or in the constructor
		this.VEHICLE_TYPE = "TEST";
	}
	
	
	public void test() {
		//ACCESSING STATIC VALUES
//		Vehicle.isMyFavorite
//		Vehicle.parkingLocation
	}

}
