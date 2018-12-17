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
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		System.out.println("Salary: " + salary);
		System.out.println("Hours Of Work: " + hoursOfWork);
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
	public double calSalaryBonus() {
		
		if( hoursOfWork >= 200) {
			return salary *0.2;
		}
		else if(hoursOfWork < 200 && hoursOfWork >= 100) {
			return salary *0.1; 
		}
			return 0;
	}
}
