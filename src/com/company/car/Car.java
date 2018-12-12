package com.company.car;

import java.util.Date;

public class Car {
	
	// số bánh
	public int numberOfWheels;
	// màu sắc
	public String color;
	// nha san xuat 
	public String manufactuner;
	// sức chứa
	public int capcity;
	// năm sản xuất
	public int yearManufactuner;
	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getManufactuner() {
		return manufactuner;
	}
	
	public void setManufactuner(String manufactuner) {
		this.manufactuner = manufactuner;
	}
	
	public int getCapcity() {
		return capcity;
	}
	
	public void setCapcity(int capcity) {
		this.capcity = capcity;
	}
	
	public int getYearManufactuner() {
		return yearManufactuner;
	}
	
	public void setYearManufactuner(int yearManufactuner) {
		this.yearManufactuner = yearManufactuner;
	}
	
	public String move(int km) {
		return "Xe đã di chuyển số "+ km;
	}
	
	
}

