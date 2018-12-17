package com.company.car;

public class Moto extends Vihicle {
	// phanh đĩa  
	// phanh tay 
	
	private String discbrakes;
	private String handbrake;
	
	public Moto(int numberOfWheels, String color, String manufactuner, int capcity, int yearManufactuner,String discbrakes,String handbrake) {
		super(numberOfWheels, color, manufactuner, capcity, yearManufactuner);
		
		this.discbrakes = discbrakes;
		this.handbrake = handbrake;
	}
	
	public void display() {
		System.out.println("Số bánh: " + numberOfWheels);
		System.out.println("Màu sắc: " + color);
		System.out.println("Nhà sản xuất: " + manufactuner);
		System.out.println("Sức chứa: " + capcity);
		System.out.println("Năm sản xuất: " + yearManufactuner);
		System.out.println("Có phanh đĩa: " + discbrakes);
		System.out.println("Có phanh tay: " + handbrake);
	}
	
	
	public String getDiscbrakes() {
		return discbrakes;
	}
	// phanh dia 
	public void setDiscbrakes(String discbrakes) {
		discbrakes = discbrakes;
	}
	public String getHandbrake() {
		return handbrake;
	}
	// phanh tay
	public void setHandbrake(String handbrake) {
		handbrake = handbrake;
	}
	
	// method lên số - lên số 1 lên số 2 lên số 3 lên số 4 
	public int upNumber(int number) {
		return number;
	}
	
}
