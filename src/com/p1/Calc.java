package com.p1;

public class Calc {
	
	public static void main(String[] args) {
	Driver driver=new CarDriver();
	System.out.println(driver.getDrivableVehicle());
	System.out.println(driver.getDriverName());
	System.out.println(((CarDriver)driver).isSpoertsCar());
	
	driver=new BikeDriver();
	System.out.println(driver.getDrivableVehicle());
	System.out.println(driver.getDriverName());
	BikeDriver bikeDriver=(BikeDriver)driver;
	System.out.println(bikeDriver.isLuxuryBike());
	

	}

}
