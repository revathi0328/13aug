package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
		System.out.println("987654");
	}
	public void fixed() {
		System.out.println("80000");
	}
	public static void main(String[]args) {
		BankInfo B = new BankInfo();
		B.saving();
		B.fixed();
		B.deposit();
		
	}

}
