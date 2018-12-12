package com.company.salary;

public class Employee {
	String name;
	int age;
	String address;
	int salary;
	int hoursOfWork;
	
	public Employee() {		
	}
	
	public Employee(String name, int age, String address, int salary, int hoursOfWork) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
		this.hoursOfWork = hoursOfWork;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getHoursOfWork() {
		return hoursOfWork;
	}
	public void setHoursOfWork(int hoursOfWork) {
		this.hoursOfWork = hoursOfWork;
	}
	public double calSalaryBonus(int houseWork,int tSalary) {
		
		if(houseWork >= 200) {
			return tSalary*20/100;
		}
		else if(houseWork < 200 && houseWork >= 100) {
			return tSalary*10/100; 
		}
		else {
			return 0;
		}
		
		
	}
}
