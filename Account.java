package bank_atm;
import java.util.*;
public class Account {
	int amount;
	int pin_number;
	int balance_amount;
	String acc_holder_name;
	double aadhar_num;
	Scanner sc = new Scanner(System.in);
	
	public void createAccount() {
		System.out.println("Enter name:");
		acc_holder_name=sc.next();
		System.out.println("Enter aadhar number:");
		aadhar_num = sc.nextDouble();
		System.out.println("Enter pin number:");
		pin_number=sc.nextInt();
		System.out.println("Account created successfully!!");
	}
	public void validatePinNumber() {
		System.out.println("Enter pin ");
		int pin = sc.nextInt();
		if (pin==pin_number) {
			System.out.println("Pin number verified!");
		}
		else {
			System.out.println("Incorrect pin number..."
					+ "Enter correct pin number..");
			validatePinNumber();
		}
		
	}
	public void depositAmount() {
		System.out.println("Enter deposit amount:");
		balance_amount=sc.nextInt();
		System.out.println("Amount deposited successfully!!");
	}
	private void withdrawAmount (int withdraw_amount) {
		if(balance_amount>=withdraw_amount) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw Rs:" +withdraw_amount);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			}
			balance_amount=balance_amount-withdraw_amount;
			System.out.println(Thread.currentThread().getName()+ " Completed withdrawl of Rs: " +withdraw_amount);
			
		}
		else {
			System.out.println("Insufficient balance for"+Thread.currentThread().getName()+" to withdraw"+ balance_amount);
			
		}
	}
	public void withdraw()
	{
		System.out.println("Enter the withdrawl amount");
		int amount=sc.nextInt();
			withdrawAmount(amount);
			if(balance_amount<0)
			{
				System.out.println("Insufficient Balance to Withdraw..");
			} 
		}
	public void viewDetails()
	{
		System.out.println("name:"+acc_holder_name);
		System.out.println("aadhar number"+aadhar_num);
		System.out.println("pin number"+pin_number);
		System.out.println("available balance"+balance_amount);
		
	}
	public synchronized  void menu()
    {
	    int key=0;
		while(true)
		 {
			System.out.println("Enter your choice");
			System.out.printf("1.Create new Account\n2.Deposit\n3.Withdraw\n4.View Details\n");
			key=sc.nextInt();
            switch(key)
			{
			case 1:
				{
					createAccount();
				    break;
				}
				case 2:
			   { 
				  validatePinNumber();
			      depositAmount();
			      break;
			   }
			case 3:
			    {  
			       validatePinNumber();
			       withdraw();
				   break;
			     }
			    
			case 4:
				{
			       viewDetails();
				   break;
				}
			
			 default:
				 System.out.println("Enter valid choice");
				
			}
		}
	}
}

