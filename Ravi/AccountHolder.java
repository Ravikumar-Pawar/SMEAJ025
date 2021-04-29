package com.BankAtm;



public class AccountHolder implements Runnable {
	private Account account;
	
	public AccountHolder(Account account) {
		this.account = account;
	}
	
	
	
	private synchronized void  MakeWithdrawal(int with_amount) {
		if(account.getBalance()>=with_amount) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw Rs: "+with_amount );
			
			try {
				Thread.sleep(3000);	
			}
			catch (InterruptedException e) {				
				
			}
			account.withdraw(with_amount);
			System.out.println(Thread.currentThread().getName() +" Completed withdrawal Of Rs: "+with_amount);
			
		}
		else {
			System.out.println("Sorry! Not Enough Balance for "+ Thread.currentThread().getName()+" to withdraw "+ account.getBalance());
		}
	}
	
	
	
	public void run()
	{
		for(int i=0;i<5;i++) {
			MakeWithdrawal(5000);
			if(account.getBalance()<0) {
				System.out.println("Insufficient Balance..");
			}
		}
	}
	
	
	

}
