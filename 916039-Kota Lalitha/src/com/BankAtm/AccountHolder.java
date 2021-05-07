package com.BankAtm;
public class AccountHolder  implements Runnable {
	private Account account;
	
	public AccountHolder(Account account) {
		this.account = account;
	}
	
    public void run()
	{
		account.menu();
	}



	
	
	
	

}