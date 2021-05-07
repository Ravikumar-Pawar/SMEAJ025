package multiThreading;

import java.util.Scanner;

public class Menu {
	private Account account;

	public Menu(Account account) {
		this.account = account;
	}
	
	public void welcome() {
		
		System.out.println("Welcome " + Thread.currentThread().getName());
	}

	public synchronized int enter() {

		Scanner sc = new Scanner(System.in);

		System.out.println("MENU\n1.Withdraw\n2.Deposit\n3.CheckBalance\n4.Exit");
		return sc.nextInt();

	}

	public synchronized boolean pinValidate() {

		Scanner sc = new Scanner(System.in);
		int attempt = 3;

		while (attempt > 0) {
			System.out.println("Enter PIN");
			int pin = sc.nextInt();
			if (pin == account.getAccountPin()) {
				return true;
			}
			attempt--;
			
			if (attempt > 0)
				System.out.println("Incorrect PIN. You have " + attempt + " attempt(s) left.");
		}

		System.out.println("All attempts exhausted. Contact your bank!");
		return false;
	}
	


}
