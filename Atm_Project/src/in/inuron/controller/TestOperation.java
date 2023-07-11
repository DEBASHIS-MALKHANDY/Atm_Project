package in.inuron.controller;

import java.util.Scanner;

public class TestOperation {
	public void Basicdetails() 
	{ 
	    String name="Debashis Malkhandy";
		long Accno =1234989876;
		String Ifsc="SBI567383";
		String addres="India, Banglore";

				System.out.println("******NURO BANK******");
				System.out.println("NAME           : "+name);
				System.out.println("ACCOUNT NUMBER : "+Accno);
				System.out.println("IFSC CODE      : "+Ifsc);
				System.out.println("ADDRESSS       : "+ addres);
							
	}

}

class BankAccount{
	int balance=0;
	int TransactionHistory=0;
	//int  withdraw, deposit;  
	
	
	
	void deposit(int amount) {
		
			balance = balance + amount;
			TransactionHistory = amount;
			System.out.println();
			System.out.println("Transaction successful");
		
	}
	
	void withdraw(int amount) {
		if(balance < 0 || balance==0 ) {
			System.out.println("Insufficient Funds");
			
		}
		else
		{
			balance = balance - amount;
			TransactionHistory = -amount;
			System.out.println();
			System.out.println("Transaction successful");
		}
	}
	void transfer(int amount)
	
	{
		
		if(balance>amount)
		{
			
			
			balance=balance - amount;
			TransactionHistory=-amount;
			System.out.println();
			System.out.println("Transaction successful to this account");
			
		}
		else
		{
			System.out.println("Insufficient Funds ");
		}
	}
	
	void showMenu() {
		
		char option = '\0';
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println();
		System.out.println("1 : Current Account Balance");
		System.out.println("2 : Deposit");
		System.out.println("3 : Withdraw");
		System.out.println("4 : Transfer");
		System.out.println("5 : Exit The System");
		
		do {
			System.out.println("");
			System.out.println("-------------------------------------------------------");
			System.out.println("**** PLEASE SELECT A OPTION ****");
			System.out.println("-------------------------------------------------------");
			System.out.println();
			option = sc.next().charAt(0);
			System.out.println("\n");
			
			switch (option) {
			
			case '1':
				System.out.println("------------------------");
				System.out.println("Current Balance = "+balance);
				System.out.println("------------------------");
				
				break;
				
			case '2':
				
				System.out.println("Enter an amount to deposit: ");
				
				
				int amount = sc.nextInt();
				deposit(amount);
				break;
				
			case '3':
				
				System.out.println("Enter an amount to withdraw: ");
				
				
				int amount2 = sc.nextInt();
				withdraw(amount2);
				
				break;
				
			case '4':
				System.out.print("Enter the account num you want to transfer the money:");
				long ac=sc.nextLong();
				
				System.out.println("Enter an amount to Transfer: ");
				
				
				int amount3 = sc.nextInt();
				transfer(amount3);
				
				
				break;	
				
			case '5' :
				System.out.println("=========================================================================================================");
				break;

			default:
				System.out.println("Invalid Option!! Please Enter Correct Opton...");
				break;
			}			
		}
		while(option != '5');
			System.out.println("Thank You for Using our Services.....!!");
	}
}	





