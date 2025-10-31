import java.util.*;
import java.io.*;

class SavingsAccount extends CheckingAccount {

	double interestRate;
       
	public static void main(String[] args) {
        	SavingsAccount sa = new SavingsAccount();
        	sa.setInterestRate();
        	sa.start();
	}// end main

	public void setInterestRate() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in the interest rate: ");
		this.interestRate = input.nextDouble();

	}// end setInterestRate
	
	public double getInterestRate() {
		return this.interestRate;

	}// end getInterestRate

	public void calcInterest() {
		System.out.println("\n You're in calcInterest()");
		double interest = this.balance * (this.interestRate /100);
		balance += interest;
		System.out.println("interest:" + interest);
		System.out.println("balance:"+ balance);
/*
		System.out.println("Interest Added: $" + String.format("%.2f, interest"));
		System.out.println("New Balance :$" + this.getBalanceString());
*/	
	}// end claclInterest

	public String Menu(){
		System.out.println("\n=== Saving Account Menu ===");
		System.out.println("0. Exit");
        	System.out.println("1. Check Balance");
		System.out.println("2. Make Deposit");
		System.out.println("3 Make Withdrawal");
		System.out.println("4 Calculate Interest");
        	System.out.print("Enter your choice: ");
		System.out.println("\n=== Saving Account Menu ===");

		Scanner scanner = new Scanner(System.in);
		String response = scanner.nextLine();
		return response;
	}// end Menu();
	//
	
public void start() {
        boolean keepGoing = true;

        while (keepGoing) {
            String response = Menu();

            if (response.equals("0")) {
                System.out.println("Goodbye");
                keepGoing = false;
            }
            else if (response.equals("1")) {
                this.checkBalance();
            }
            else if (response.equals("2")) {
                this.makeDeposit();
            }
            else if (response.equals("3")) {
                this.makeWithdrawal();
            }
            else if (response.equals("4")) {
                this.calcInterest();
            }
            else {
                System.out.println("Please enter 0, 1, 2, 3, or 4.");
            }
        } // end while 
    } //end start
}// end class Savings Account
