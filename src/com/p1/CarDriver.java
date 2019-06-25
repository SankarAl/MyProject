package com.p1;

public class CarDriver implements Driver {

	@Override
	public String getDrivableVehicle() {
		// TODO Auto-generated method stub
		return "HondaCar";
	}

	@Override
	public String getDriverName() {
		// TODO Auto-generated method stub
		return "HondaDriver1";
	}

	boolean isSpoertsCar(){
		return false;
	}
	
}
