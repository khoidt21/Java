package com.company.car;

import java.text.Bidi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car ford = new Car(4,"Màu trắng", "Ford", 4, 1990,"Mui trần",null);
		Car toyota = new Car(4,"Màu đỏ", "", 7, 1987, null,"Không mui");
		ford.display();
		// di chuyen bao nhieu km
		System.out.println(ford.move(10000));
		System.out.println("---------------------------------------------");
		toyota.display();
		System.out.println(toyota.move(2000));
		
		// Xe may 
		System.out.println("---------------------------------------------");
		Moto dream = new Moto(2,"Màu đen","Dream", 2, 1990,"Phanh đĩa",null);
		Moto sh2018 = new Moto(2,"Màu trắng","SH", 2, 1981, null, "Phanh tay");
		Moto lead = new Moto(2,"Màu đỏ","Lead", 2, 1985, "Phanh tay", null);
		
	    dream.display();
	    System.out.println("Xe dream lên số " + dream.upNumber(2));
	    System.out.println("---------------------------------------------");
	    
	    sh2018.display();
	    System.out.println("Xe sh lên số " + sh2018.upNumber(3));
	    System.out.println("---------------------------------------------");
	    
	    lead.display();
	    System.out.println("Xe lead lên số "+ lead.upNumber(4));
	    System.out.println("-----------------------------------------------");
	      
		// Xe dap     
	    Bike phuongHoang = new Bike(2,"Màu trắng","Phượng hoàng", 2, 1987,"Vành xe đỏ","ghi đông thẳng");
	    phuongHoang.display();
	    System.out.println("Phượng hoàng " + phuongHoang.whistle());
	    System.out.println("---------------------------------------");
	    
	    Bike thongNhat = new Bike(2,"Màu đỏ","Thống nhất",2, 1988,"Vành xe trắng", "ghi đông ngang");
	    thongNhat.display();
	    System.out.println("Thống nhất " + thongNhat.whistle());
	    System.out.println("---------------------------------------");
	    
	    Bike jaPan = new Bike(2,"Màu xanh","Japan",2, 1989, "Vành xe xanh", "ghi đông ngang");
	    jaPan.display();
	    System.out.println("Japan " + jaPan.whistle());
	    System.out.println("---------------------------------------");
	    
	    Bike korean = new Bike(2,"Màu nước biển","Korean", 2, 1987,"Vành xe trắng","ghi đông thẳng");
	    korean.display();
	    System.out.println("Korean " + korean.whistle());
	    System.out.println("---------------------------------------");
	    
	    Bike china = new Bike(2,"Màu xanh da trời", "China", 2, 1986, "Vành xe màu ghi", "ghi đông ngang");
	    china.display();
	    System.out.println("China " + china.whistle());
		System.out.println("----------------------------------------------");
	}

}
