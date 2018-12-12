package com.company.car;

public class XeHoi extends Car {
	// mui trần
	String convertibles;
	// không mui 
	String bandy;
	
	public String getConvertibles() {
		return convertibles;
	}
	public void setConvertibles(String convertibles) {
		this.convertibles = convertibles;
	}
	public String getBandy() {
		return bandy;
	}
	public void setBandy(String bandy) {
		this.bandy = bandy;
	}
	
	public String AutomaticSettings() {
		return "Xe đi số tự động";
	}
	public String SelfSteeringNumber(){
		return "Xe đi số tự lái";
	}
	
	
	
}
