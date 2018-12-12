package com.company.varible;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account(1, "Cong Phuong", 20);
		System.out.println(account1.getCount());
		Account account2 = new Account(2, "Van Toan", 19);
		System.out.println(account1.getCount());
		
		account1.setCount(100);
		System.out.println(account2.getCount());
		
		account2.setCount(200);
		System.out.println(account1.getCount());
		
		String name = "Tuan Khoi";
		name = "Huy Dung";
		name = "Hoang Dung";
		
		float salary;
		salary = 6789.50f;
		
		int binary = 0b000110011;
		int hexa = 0X1ccc;
		int decimal = 20;
		
		long bigInteger = 1000L;
		int mediumInteger = 100;
		
		double x = 23763E-05; // 23763 * 10^-5
		System.out.println("Hello\nWorld");
		
		// Uses tab and new line escape sequences
		System.out.println("Java \t Programming \n Language");
		// Prints Tom “Dick” Harry string
		System.out.println("Tom \"Dick\" Harry");
		
		System.out.println("\u0048\u0065\u006C\u006C\u006F");
	}

}
