package com.BankAtm;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class AtmStart {
	public static void main(String[] args) throws InterruptedException {

		Account account = new Account();
		AccountHolder accountHolder = new AccountHolder(account);

		Scanner sc = new Scanner(System.in);

		List<Thread> threadList = new LinkedList<>();

		System.out.println("Enter the number of accounts you want to create");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter name of account " + i);
			Thread t = new Thread(accountHolder);
			t.setName(sc.nextLine());
			threadList.add(t);
		}

		for (Thread thread : threadList) {
			thread.start();
		}

	}

}
