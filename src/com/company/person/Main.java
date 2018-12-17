package com.company.person;

import java.util.Scanner;

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
		
		int a=5;
		System.out.println(a++);
		System.out.println("----------------");
		System.out.println(++a);
		
		int thang;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen (tu 1 den 12):");
		thang = scanner.nextInt();
		switch (thang) {
		case 1: 
			System.out.println("Tháng 1");
			break;
		case 2: 
			System.out.println("Tháng 2");
			break;
		case 3: 
			System.out.println("Tháng 3");
			break;
		case 4:
			System.out.println("Tháng 4");
			break;
		case 5: 
			System.out.println("Tháng 5");
			break;
		case 6: 
			System.out.println("Tháng 6");
			break;
		case 7:
			System.out.println("Tháng 7");
			break;
		case 8:
			System.out.println("Tháng 8");
			break;
		case 9:
			System.out.println("Tháng 9");
			break;
		case 10:
			System.out.println("Tháng 10");
			break;
		case 11:
			System.out.println("Tháng 11");
			break;
		case 12:
			System.out.println("Tháng 12");
			break;
		default:
			System.out.println("Tháng phải nhập trong khoảng từ 1 đến 12");
			break;
		}
		int A[] = {1,2,3,4,5};
	    for(int i=0;i<A.length;i++) {
	    	System.out.println(A[i]);
	    }
	    int B[] = new int[4];
	    B[0] = 1;
	    B[1] = 23;
	    B[2] = 34;
	    B[3] = 45;
	    for(int i=0;i<B.length;i++) {
	        System.out.println(B[i]);	
	    }
	    // mang 2 chieu 
	    //int [][] marks = new int[4][2];
	    //int [][] marks = {0,1},{1,2}
	    
	    // khai bao mang 2 chieu co 3 dong 2 cot
	    
	    int diem[][] = {{1,2},{2,3},{3,4}};
	    System.out.println("Phần tử nằm ở dòng 2 cột 1 " + diem[2][1]);
	    
	}

}
