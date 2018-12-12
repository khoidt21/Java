package com.company.salary;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee nv1 = new Employee("Tuan Khoi",29, "Ha Noi", 2000, 200);
		//nv1.getBonus(2000, 150);
		System.out.println(nv1.getName());
		System.out.println(nv1.getAge());
		System.out.println(nv1.getAddress());
		System.out.println(nv1.getSalary());
		System.out.println(nv1.getHoursOfWork());
		System.out.println("Tien luong bonus nhan vien 1 "+ nv1.calSalaryBonus(200,2000));
		System.out.println("------------------------------------------------");
		
		Employee nv2 = new Employee("Pham Thi Dao",28,"Thai Nguyen",2000,109);
		System.out.println(nv2.getName());
		System.out.println(nv2.getAge());
		System.out.println(nv2.getAddress());
		System.out.println(nv2.getSalary());
		System.out.println(nv2.getHoursOfWork());
		System.out.println("Tien luong bonus nhan vien 2 " + nv2.calSalaryBonus(109,2000));
		System.out.println("-------------------------------------------------");
		
		Employee nv3 = new Employee("Nguyen Xuan Bang",22,"Nha Trang",3000,500);
		System.out.println(nv3.getName());
		System.out.println(nv3.getAge());
		System.out.println(nv3.getAddress());
		System.out.println(nv3.getSalary());
		System.out.println(nv3.getHoursOfWork());
		System.out.println("Tien luong bonus nhan vien 3 " + nv3.calSalaryBonus(500, 3000));
		System.out.println("-------------------------------------------------");
		
		Employee nv4 = new Employee("Nguyen Bang Nam",21,"Thai Binh",1000,182);
		System.out.println(nv4.getName());
		System.out.println(nv4.getAge());
		System.out.println(nv4.getAddress());
		System.out.println(nv4.getSalary());
		System.out.println(nv4.getHoursOfWork());
		System.out.println("Tien luong bonus nhan vien 4 "+ nv4.calSalaryBonus(182, 1000));
		System.out.println("--------------------------------------------------");
		
		Employee nv5 = new Employee("Nguyen Tuan Duc",27,"Bac Giang",1500,80);
		System.out.println(nv5.getName());
		System.out.println(nv5.getAge());
		System.out.println(nv5.getAddress());
		System.out.println(nv5.getSalary());
		System.out.println(nv5.getHoursOfWork());
		System.out.println("Tien luong bonus nhan vien 5 " + nv5.calSalaryBonus(80,1500));
		
		
		
	}

}
