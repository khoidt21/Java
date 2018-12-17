package com.company.car;

public class Car extends Vihicle {
	// mui trần
	private String convertibles;
	// không mui 
	private String bandy;
	
	public Car(int numberOfWheels,String color,String manufactuner,int capcity,int yearManufactuner,String convertibles,String bandy) {
		 super(numberOfWheels, color, manufactuner, capcity, yearManufactuner);
		 
		 this.convertibles = convertibles;
		 this.bandy = bandy;
	}
	
	public void display() {
		 System.out.println("Số bánh: " + numberOfWheels);
		 System.out.println("Màu sắc: " + color);
		 System.out.println("Nhà sản xuất: " + manufactuner);
		 System.out.println("Sức chứa: " + capcity);
		 System.out.println("Năm sản xuất: " + manufactuner);
		 System.out.println("Xe có mui trần : " + convertibles);
		 System.out.println("Xe không mui: " + bandy);
		 
	}
	
	
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
