package just;
import java.util.*;

public class Customer{
	long acno;
	double bal;
	Customer(long acno, double bal){
		this.bal = bal;
		this.acno = acno;
	}
	
	public static void deposit(long ac_num,Scanner s,List<Customer> acc) {
		for(Customer l : acc) {
			if(l.acno== ac_num) {
				System.out.println("Enter the amount to deposit: ");
				double balance = s.nextDouble();
				l.bal += balance; 
				System.out.println("Amount deposited to your account successfully");
			}
		}
	}
	public static void withdraw(long ac_num,Scanner s,List<Customer> acc) {
		for(Customer l : acc) {
			if(l.acno== ac_num) {
				System.out.println("Enter the amount to deposit: ");
				double balance = s.nextDouble();
				if(l.bal>0) {
					l.bal -= balance; 
				}
				else {
					System.out.println("Insufficient Balance");
				}
			}
		}
	}
	
	public static void Receipt(long ac_num,List<Customer> acc) {
		for(Customer l : acc) {
			if(l.acno== ac_num) {
				System.out.println("Account number: "+l.acno);
				System.out.println("Current Balance: "+l.bal);
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Customer> acc = new ArrayList<>();
		System.out.println("Welcome to ATM...");
		System.out.println("Enter your Account number: ");
		long num = s.nextLong();
		Customer cus = new Customer(num, 0);
		System.out.println("Choose the following options to proceed:");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Receipt");
		s.nextLine();
		acc.add(cus);
		String type = s.nextLine();
		if(type.equalsIgnoreCase("Deposit")) {
			System.out.println("Enter to your account number to confirm transaction: ");
			long ac_no = s.nextLong();
			deposit(ac_no,s,acc);
			}
		
	
		if(type.equalsIgnoreCase("withdraw")) {
			System.out.println("Enter to your account number to confirm transaction: ");
			long ac_no = s.nextLong();
			withdraw(ac_no,s,acc);
			}
		
		if(type.equalsIgnoreCase("Receipt")) {
			System.out.println("Enter to your account number to confirm transaction: ");
			long ac_no = s.nextLong();
			Receipt(ac_no,acc);
			}

	}

}
