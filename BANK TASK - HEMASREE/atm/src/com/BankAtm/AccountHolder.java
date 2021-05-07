package com.BankAtm;
public class AccountHolder  implements Runnable {
	private Account acc;
	
	public AccountHolder(Account acc) {
		this.acc = acc;
	}
	
    public void run()
	{
		acc.menu();
	}
}