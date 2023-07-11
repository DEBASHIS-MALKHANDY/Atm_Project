package in.inuron.controller;

import java.util.Scanner;


public class AtmApp {
	public void verification()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("**********WELCOME TO NURO  BANK @PVT.ltd**********");
		System.out.println("please enter customerid : ");
		String customerid=sc.next();
		String verifiedid="deb@123";
		System.out.println("please enter password : ");
		String password=sc.next();
		String verifiedpass="1234";
				
		if((customerid.equals(verifiedid)) && (password.equals(verifiedpass)))
		{
			TestOperation obj1=new TestOperation();
			obj1.Basicdetails();
			BankAccount obj2 = new BankAccount();
			obj2.showMenu();
			
	    }
		else
		{
			System.out.println("Login Failed");
		}
		
		
		
		
		
				
	}

}
