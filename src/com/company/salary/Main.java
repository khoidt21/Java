package com.company.salary;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee nv1 = new Employee("Tuan Khoi",29, "Ha Noi", 2000, 200);
		//nv1.getBonus(2000, 150);
		nv1.display();
		
		System.out.println("Tien luong bonus nhan vien 1 "+ nv1.calSalaryBonus());
		System.out.println("------------------------------------------------");
		
		Employee nv2 = new Employee("Pham Thi Dao",28,"Thai Nguyen",2000,109);
		nv2.display();
		System.out.println("Tien luong bonus nhan vien 2 " + nv2.calSalaryBonus());
		System.out.println("-------------------------------------------------");
		
		Employee nv3 = new Employee("Nguyen Xuan Bang",22,"Nha Trang",3000,500);
		nv3.display();
		System.out.println("Tien luong bonus nhan vien 3 " + nv3.calSalaryBonus());
		System.out.println("-------------------------------------------------");
		
		Employee nv4 = new Employee("Nguyen Bang Nam",21,"Thai Binh",1000,182);
		System.out.println("Tien luong bonus nhan vien 4 "+ nv4.calSalaryBonus());
		System.out.println("--------------------------------------------------");
		
		Employee nv5 = new Employee("Nguyen Tuan Duc",27,"Bac Giang",1500,80);
		nv5.display();
		System.out.println("Tien luong bonus nhan vien 5 " + nv5.calSalaryBonus());
		
	}

}
