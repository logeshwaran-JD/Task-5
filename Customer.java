package just;

import java.util.*;

public class Customer{
	long acno;
	double bal;
	Customer(long acno, double bal){
		this.bal = bal;
		this.acno = acno;
	}
	
	public static void deposit(long ac_num, Scanner s, List<Customer> acc) {
		boolean found = false;
		for(Customer l : acc) {
			if(l.acno == ac_num) {
				System.out.println("Enter the amount to deposit: ");
				double balance = s.nextDouble();
				if(balance > 0) {
					l.bal += balance; 
					System.out.println("Amount deposited successfully");
					System.out.println("New Balance: " + l.bal);
				} else {
					System.out.println("Invalid amount. Please enter a positive value.");
				}
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Account not found!");
		}
	}
	
	public static void withdraw(long ac_num, Scanner s, List<Customer> acc) {
		boolean found = false;
		for(Customer l : acc) {
			if(l.acno == ac_num) {
				System.out.println("Enter the amount to withdraw: ");
				double balance = s.nextDouble();
				if(balance > 0 && l.bal >= balance) {
					l.bal -= balance; 
					System.out.println("Amount withdrawn successfully");
					System.out.println("Remaining Balance: " + l.bal);
				} else if(balance <= 0) {
					System.out.println("Invalid amount. Please enter a positive value.");
				} else {
					System.out.println("Insufficient Balance. Current Balance: " + l.bal);
				}
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Account not found!");
		}
	}
	
	public static void Receipt(long ac_num, List<Customer> acc) {
		boolean found = false;
		for(Customer l : acc) {
			if(l.acno == ac_num) {
				System.out.println("=== Account Statement ===");
				System.out.println("Account Number: " + l.acno);
				System.out.println("Current Balance: $" + l.bal);
				System.out.println("========================");
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Account not found!");
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Customer> acc = new ArrayList<>();
		
		System.out.println("=== Welcome to ATM ===");
		System.out.println("Enter your Account Number: ");
		long num = s.nextLong();
		Customer cus = new Customer(num, 0);
		acc.add(cus);
		
		while(true) {
			System.out.println("\nChoose an option:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance Inquiry");
			System.out.println("4. Exit");
			System.out.print("Enter your choice (1-4): ");
			
			int choice = s.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Enter your account number to confirm: ");
					long ac_no1 = s.nextLong();
					deposit(ac_no1, s, acc);
					break;
				case 2:
					System.out.println("Enter your account number to confirm: ");
					long ac_no2 = s.nextLong();
					withdraw(ac_no2, s, acc);
					break;
				case 3:
					System.out.println("Enter your account number to confirm: ");
					long ac_no3 = s.nextLong();
					Receipt(ac_no3, acc);
					break;
				case 4:
					System.out.println("Thank you for using our ATM service!");
					s.close();
					return;
				default:
					System.out.println("Invalid choice! Please select 1-4.");
			}
		}
	}
}
