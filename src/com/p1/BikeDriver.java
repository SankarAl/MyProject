package com.p1;

public class BikeDriver implements Driver{

	@Override
	public String getDrivableVehicle() {
		// TODO Auto-generated method stub
		return "BajajPulsar";
	}

	@Override
	public String getDriverName() {
		// TODO Auto-generated method stub
		return "PulsarDriver1";
	}
	
	boolean isLuxuryBike(){
		return false;
	}
	
	
}
