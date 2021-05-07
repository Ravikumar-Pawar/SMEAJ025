package com.BankAtm;

public class AtmStart {
	public synchronized static void main(String[] args) throws InterruptedException {
		
		
		Account account  = new Account();
		AccountHolder accountHolder = new AccountHolder(account);
		
		
		
		Thread t1 =  new Thread(accountHolder);
		Thread t2 = new Thread(accountHolder);
		
		
		t1.setName("Raj");
		t2.setName("Rani");

		
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		
		
		
	}

}
