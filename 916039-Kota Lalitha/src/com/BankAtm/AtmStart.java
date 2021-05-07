package com.BankAtm;

public class AtmStart {
	public static void main(String[] args) {

       
		Account account  = new Account();
		AccountHolder accountHolder = new AccountHolder(account);

		Thread t1 =  new Thread(accountHolder);
		Thread t2 = new Thread(accountHolder);
		//Thread t3 = new Thread(accountHolder);

		t1.setName("Raj");
		t2.setName("Rani");
		//t3.setName("Raju");


		t1.start();
		t2.start();
		//t3.start();


	}

}