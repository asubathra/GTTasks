package org.bank;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("Deposit 5%");

}

public static void main(String[] args) {
	AxisBank axisBank=new AxisBank();
	axisBank.deposit();
	axisBank.savings();
	axisBank.fixed();
}
}
