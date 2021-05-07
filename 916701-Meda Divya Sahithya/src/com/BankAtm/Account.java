package com.BankAtm;
import java.util.Scanner;
public class Account {
	   int amount,balance,pin;
	   double number;
		String name;
		Scanner sc=new Scanner(System.in);
		public void create() {
			System.out.println("Enter Your Name");
			name=sc.next();
			System.out.println("Enter Your Phone number");
			number=sc.nextDouble();
			System.out.println("Enter Your pin number");
			pin=sc.nextInt();	
		}
public void deposit() 
          {
			 System.out.println("Enter the amount to be deposited");
			  balance=sc.nextInt();
			}
public void pinValidate()
		{ 
			System.out.println("Enter your pin: ");
		    int p=sc.nextInt();
			if(p==pin)
					System.out.println("Verified Successfully");
			 else {
			    	System.out.println("Incorrect pin");
			    	pinValidate();
				   }
		}
private  void  MakeWithdrawal(int with_amount) {
	if(balance>=with_amount) {
		System.out.println(Thread.currentThread().getName()+" is going to withdraw Rs: "+with_amount );
		
		try {
			Thread.sleep(3000);	
		}
		catch (InterruptedException e) {				
			
		}
		balance-=with_amount;
		System.out.println(Thread.currentThread().getName() +" Completed withdrawal Of Rs: "+with_amount);
		
	}
	else {
		System.out.println("Sorry! Not Enough Balance for "+ Thread.currentThread().getName()+" to withdraw "+ balance);
		
	}
}



public void withdraw()
{
	System.out.println("Enter the amount to be withdrawn");
	int amount=sc.nextInt();
		MakeWithdrawal(amount);
		if(balance<0)
		{
			System.out.println("Insufficient Balance..");
		} 
	}

public void viewDetails()
{
System.out.println("Yor name: "+name);
System.out.println("Your number: "+number);
System.out.println("Your pin no: "+pin);	
System.out.println("Your available balance is "+balance);
}
public synchronized  void menu()
    {
	    int key=0;
		while(true)
		 {
			System.out.println("Enter your choice");
			System.out.printf("1.Create new Account\n2.Deposit\n3.Withdraw\n4.View Details\n5.exit\n");
			key=sc.nextInt();
            switch(key)
			{
			case 1:
				{
					create();
				    break;
				}
				case 2:
			   { 
				  pinValidate();
			      deposit();
			      break;
			   }
			case 3:
			    {  
			       pinValidate();
			       withdraw();
				   break;
			     }
			    
			case 4:
				{
			       viewDetails();
				   break;
				}
			case 5:
			   { 
				   System.exit(0);
			    }
			 default:
				 System.out.println("Enter valid choice");
				
			}
		}
	}
}
		 