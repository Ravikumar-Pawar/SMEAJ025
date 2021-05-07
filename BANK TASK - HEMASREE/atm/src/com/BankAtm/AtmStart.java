package com.BankAtm;

public class AtmStart {
	public static void main(String[] args) {

       
		Account acc  = new Account();
		AccountHolder acchol = new AccountHolder(acc);

		Thread t1 =  new Thread(acchol);
		Thread t2 = new Thread(acchol);
		
		t1.setName("Raj");
		t2.setName("Rani");
		

		t1.start();
		t2.start();
		


	}

}