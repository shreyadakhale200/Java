package customer_enumUtilityArrayObjects;

import java.util.Scanner;

public class CustomerArrayUtility {
	public static void AcceptCustomerDetails(Customer[] arr)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Customer ID = ");
			int custid = sc.nextInt();
			
			System.out.println("Enter Customer Name = ");
			String custname = sc.next();
			
			System.out.println("Enter Account ID = ");
			String acctid = sc.next();
			
			System.out.println("Enter Account balance = ");
			double balance = sc.nextDouble();
			
			System.out.println("Enter Account Type = ");
			int acctype = sc.nextInt();
			AccountType typeacc = null;
			switch(acctype)
			{
			case 1:
				typeacc = AccountType.SAVING;
				break;
			case 2:
				typeacc = AccountType.CURRENT;
				break;
			case 3:
				typeacc = AccountType.RECURRING;
				break;
			}
			arr[i] = new Customer(custid,custname,new Account(acctid,balance,typeacc));
		}
	}
	
	public static void DisplayCustomerDetails(Customer[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
