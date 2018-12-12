package com.company.account;


public class Account {
	
	private int accountID;
	private String hoderName;
	private String accountType;
	
	{
		accountID = 1;
		hoderName = "Tuan Khoi";
		accountType = "Savings";
	}
	public void displayAccountDetail() {
		System.out.println("---------------------------");
		System.out.println(accountID + "\n" + hoderName + "\n" + accountType);
	}
	public void displayArray() {
		int A[] = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}
	public void displayArrayB() {
		int b[] = new int[4];
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		b[3] = 4;
		// in ra mang 
		for(int i = 0; i < b.length;i++) {
			System.out.println(b[i]);
		}		
	}
	public void calSoChan() {
		try {
			int total = 0;
			for(int i=0;i<100;i++) {
				if(i%2 ==0) {
					total +=i;
				}
			}
			System.out.println("Tong cua cac so chan " + total);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	public void CalSoLe() {
		try {
			int total = 0;
			for(int i=0;i<100;i++) {
				if(i%2 !=0) {
					total +=i;
				}
			}
			System.out.println("Tong cua cac so le " + total);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
