package com.BankAtm;
import java.util.*;

public class Account {
	int balance=0;
	String customerName;
	int accNo; 
	int pin;
	
	
	Scanner sc = new Scanner(System.in);
/**	public int getBalance()
	{
		return balance;
	}
*/	

	public void deposit()
	{

		 System.out.println("Enter the amount to be deposited");
		  balance=sc.nextInt();
	}
	
	
	public void accountCreate() {
		System.out.println("Enter Your Name");
		customerName=sc.next();
		System.out.println("Enter Your Account number");
		accNo=sc.nextInt();
		System.out.println("Enter Your 4-Digit Pin");
		pin= sc.nextInt();
		
	}
	
	
	public void pinValidate()
	{ 
		System.out.println("Enter your 4-Digit pin: ");
	    int userPin=sc.nextInt();
		if(userPin==pin)
				System.out.println("Pin is correct. Process Starts...");
		 else {
		    	System.out.println("Incorrect pin. Try Again...");
		    	pinValidate();
			   }
	}
	
	public  void  MakeWithdrawal() {
		System.out.println("Enter the amount to be withdrawn");
		int amount=sc.nextInt();
		if(balance>=amount) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw Rs: "+amount );
			
			try {
				Thread.sleep(3000);	
			}
			catch (InterruptedException e) {				
				
			}
			
			System.out.println(Thread.currentThread().getName() +" Completed withdrawal Of Rs: "+amount);
			balance = balance-amount;
		}
		else {
			System.out.println("Sorry! Not Enough Balance for Withdrawal");
		}
	}
}
