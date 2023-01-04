package org.sample;

public class AxisBank extends RbiBank
{

	@Override
	public void savings() {
		System.out.println("Deposit 7%");
			}

	@Override
	public void deposit() {
		System.out.println("Saving 5%");
	}
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit();
		ab.savings();
		ab.fixed();
	}

}
