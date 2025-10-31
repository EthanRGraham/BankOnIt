
import java.util.*;
import java.io.*;

class CheckingAccount implements HasMenu, Serializable {
	double balance;
	
	public static void main(String[] args){
		CheckingAccount ca = new CheckingAccount();
		ca.start();
	} // end main

	public String Menu() {
        System.out.println("\n=== Checking Account Menu ===");
        System.out.println("0. Exit");
        System.out.println("1. Check Balance");
	System.out.println("2. Make Deposit");
	System.out.println("3 Make Withdrawal");
        System.out.print("Enter your choice: ");
	System.out.println("\n=== Checking Account Menu ===");
       	

	Scanner scanner = new Scanner(System.in);

	String response = scanner.nextLine(); 
	return response;
	}// end Menu()
	
	public void start(){
		boolean keepGoing = true;
		
		while (keepGoing) {
			String response = Menu();

			if (response.equals("0")) {
				System.out.println("Goodbye");
				keepGoing = false;
			}
		       if (response.equals("1")) {
			       this.checkBalance();
		       }
		       else if (response.equals("2")) {
                               this.makeDeposit();
                       }
		       else if (response.equals("3")) {
			       this.makeWithdrawal();
		       }
		       else {
			       System.out.println("Please enter 0, 1, 2, or 3.");
		       } //end if
		}// end keepGoing 
	} // end start()
	

	public void makeDeposit() {
	       	System.out.print("Enter the amount to deposit: ");
		double deposit = this.getDouble();
		this.balance += deposit;
		System.out.println("New Balance: $" + this.getBalanceString());
	}// end makeDeposit
	

		/*
        	double amount = scanner.nextDouble();
        	balance += amount;
        	System.out.println("You deposited $" + amount + ". New balance: $" + balance);*/
    

    	public void makeWithdrawal() {
	   	System.out.print("Enter the amount to withdraw: ");
	    	double withdrawal = this.getDouble();
		if (withdrawal > this.balance){
		       System.out.println("Insufficient funds");
		} else {
			this.balance -= withdrawal;
		} // end if
		System.out.println("New balance:" + this.getBalanceString());
	} //end makeWithdrawal

		/*double amount = scanner.nextDouble();

	    	if (amount <= 0) {
			System.out.print("Withdrawal amount must be positive");
	    	}
	    	else if (amount > balance) {
			System.out.print();*/ 

    	public void checkBalance(){
		System.out.print("You're in checkBalance()");
	} 

	public String getBalanceString(){
		String result = String.format("$%.02f", this.balance);
		return result;
	}//end getBalanceString

	private double getDouble() {
    		Scanner input = new Scanner(System.in);
   		 double result = 0.0;
   		 try {
        		System.out.print("Enter amount: ");
        		String sResult = input.nextLine();
        		result = Double.parseDouble(sResult);
		 } catch (NumberFormatException e) {
			 System.out.println("Invalid input. Please enter a numeric value.");
		 }
		 return result;
	}// end getDouble

}// end class CheckingAccount
//


