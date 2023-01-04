package org.bank;

public class BankInfo extends AxisBank {
private void saving() {
	System.out.println("Savings Account");
	
}
private void fixed() {
	System.out.println("Fixed Deposit");

}public static void main(String[] args) {
	BankInfo Bank = new BankInfo();
	Bank.deposit();
	Bank.fixed();
	Bank.saving();

}
}
