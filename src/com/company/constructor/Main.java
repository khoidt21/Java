package com.company.constructor;

class Student4{
	int id;
	String name;
	
	Student4(int i,String n){
		id = i;
		name = n;
	}
	void dispaly() {
		System.out.println(id + " " + name);
	}
}
class Student5{
	int id;
	String name;
	int age;
	
	public Student5(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}
	public Student5(int id,String name,int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println(id + " " + name + " " + age);
	}
	
}
class Student6{
	 int id;
	 String name;
	 int age;
	 public Student6(int id,String name,int age) {
		 this.id = id;
		 this.name = name;
		 this.age = age;
	 }
	 
	 public void display() {
		 System.out.println(id + " " + name + " " + age);
	 }
	 
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student4 student1 = new Student4(1, "Le Hai Trung");
		Student4 student2 = new Student4(2,"Quang Hai");
		student1.dispaly();
		student2.dispaly();
		System.out.println("------------------------------");
		Student5 student3 = new Student5(1,"Thin Dinh");
		Student5 student4 = new Student5(2,"Bang Nam Nguyen Van",21);
		
		student3.display();
		student4.display();
		
		
	}
}
