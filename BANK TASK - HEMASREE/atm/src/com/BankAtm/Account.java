package com.BankAtm;
import java.util.Scanner;
public class Account {
	   int amount,balance,pin;
	   double number;
		String name;
		Scanner scanner=new Scanner(System.in);
		public void create() {
			System.out.println("Enter Your Name");
			name=scanner.next();
			System.out.println("Enter Your Phone number");
			number=scanner.nextDouble();
			System.out.println("Enter Your pin number");
			pin=scanner.nextInt();	
		}
public void deposit() 
          {
			 System.out.println("Enter the amount to be deposited");
			  balance=scanner.nextInt();
			}
public void pinValidation()
		{ 
			System.out.println("Enter your pin: ");
		    int p=scanner.nextInt();
			if(p==pin)
					System.out.println("Verification successful");
			 else {
			    	System.out.println("Entered Pin Is Incorrect");
			    	pinValidatio();
				   }
		}
private  void  MakeWithdraw(int with_amount) {
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
	System.out.println("Enter the amount to withdraw");
	int amount=scanner.nextInt();
		MakeWithdraw(amount);
		if(balance<0)
		{
			System.out.println("Sorry! Insufficient Balance In Your Account...");
		} 
	}

public void showDetails()
{
System.out.println("Your name: "+name);
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
			System.out.printf("1.Create new Account\n 2.Deposit\n 3.Withdraw\n 4.View Details\n 5.exit\n");
			key=scanner.nextInt();
            switch(key)
			{
			case 1:
				{
					create();
				    break;
				}
				case 2:
			   { 
				  pinValidation();
			      deposit();
			      break;
			   }
			case 3:
			    {  
			       pinValidation();
			       withdraw();
				   break;
			     }
			    
			case 4:
				{
			       showDetails();
				   break;
				}
			case 5:
			   { 
				   System.exit(0);
			    }
			 default:
				 System.out.println("Enter a valid choice");
				
			}
		}
	}
}
		 