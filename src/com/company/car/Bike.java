package com.company.car;

public class Bike extends Vihicle {
	
	// màu sắc vành xe 
	// ghi đông 
	
	private String rimColor;
	private String handleBar;
	
	Bike(int numberOfWheels, String color, String manufactuner, int capcity, int yearManufactuner,String rimColor,String handleBar) {
		super(numberOfWheels, color, manufactuner, capcity, yearManufactuner);
		
		this.rimColor = rimColor;
		this.handleBar = handleBar;
	}
	public void display() {
		System.out.println("Số bánh: " + numberOfWheels);
		System.out.println("Màu sắc: " + color);
		System.out.println("Nhà sản xuất: " + manufactuner);
		System.out.println("Sức chứa: " + capcity);
		System.out.println("Năm sản xuất: " + yearManufactuner);
		System.out.println("Màu sắc vành xe: " + rimColor);
		System.out.println("Ghi đông: " + handleBar);
	}
	
	public String getRimColor() {
		return rimColor;
	}
	public void setRimColor(String rimColor) {
		this.rimColor = rimColor;
	}
	// ghi đông 
	public String getHandleBar() {
		return handleBar;
	}
	public void setHandleBar(String handleBar) {
		this.handleBar = handleBar;
	}
	// Phương thức bóp còi xe
	public String whistle() {
		return "Bạn đang bóp còi xe.";
	}
	
}
