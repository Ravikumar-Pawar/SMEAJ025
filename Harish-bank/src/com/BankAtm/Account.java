package com.BankAtm;
import java.util.*;
public class Account {
	Scanner input=new Scanner(System.in);
	int acc,acc1,acc2,pin,pin1,pin2,balance;
	
	public void createaccount()
	{
		System.out.println("Enter name:");
		String name=input.nextLine();
		System.out.println("Enter account number:");
		acc=input.nextInt();
		System.out.println("Enter pin number:");
		pin=input.nextInt();
		System.out.println("Enter amount to deposit");
		balance=input.nextInt();
	}
	public void withdraw() 
	{
		System.out.println("Enter account number");
		 acc1=input.nextInt();
		System.out.println("Enter pin number:");
		 pin1=input.nextInt();
		
		if(acc==acc1 && pin==pin1) {
			System.out.println("Enter the amount to withdraw");
			int withdraw=input.nextInt();
			balance-=withdraw;
			System.out.println("The remaining balance is:"+balance);
			
		}
		else {
			System.out.println("Invalid account/pin number or account does not exist");
		}
	}
	public void deposit()
	{
		System.out.println("Enter account number");
		acc2=input.nextInt();
		System.out.println("Enter pin number:");
		pin2=input.nextInt();
		
		if(acc==acc2 && pin==pin2) {
			System.out.println("Enter the amount to deposit");
			int deposit=input.nextInt();
			balance+=deposit;
			System.out.println("The remaining balance is:"+balance);
		}
		else {
			System.out.println("Invalid account/pin number or account does not exist");
		}
		
	}
		

}
