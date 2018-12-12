package com.company.person;

public class Main {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p = new Person();
		//p.setName("Nguyen Xuan Bang");
		
		Student student1 = new Student();
		student1.name = "Tuan Khoi";
		student1.age = 31;
		System.out.println(student1.HocBai());
		System.out.println("Tuổi " + student1.age);
		
		Student student2 = new Student();
		student2.name = "Nguyen Van Bang Nam";
		student2.age = 21;
		System.out.println(student2.HocBai());
		System.out.println("Tuổi " + student2.age);
		
		
	}

}
