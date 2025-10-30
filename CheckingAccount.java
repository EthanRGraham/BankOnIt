import java.util.Scanner;

class CheckingAccount implements HasMenu {
	private double balance = 100.00; // initial starting balance
	
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
	String response = scanner.nextLine(); // get input as a string
        return response;
	}// end Menu()
	
	public void start(){
		boolean keepGoing = true;
		string choice = Menu();
		
		/*Scanner scanner = new Scanner(System.in);

		while (keepGoing) {
			Menu();
			int choice = scanner.nextInt();

			if (choice == 0) {
				System.out.println("Goodbye");
				keepGoing = false;
			}
		       if (choice == 1) {
			       this.checkBalance();
		       }
		       else if (choice == 2) {
                               this.makeDeposit(scanner);
                       }
		       else if (choice == 3) {
			       this.makeWithdrawal(scanner);
		       }
		       else {
			       System.out.println("Please enter 0, 1, 2, or 3.");
		       }
		}// end keepGoing
		scanner.close(); 
	} // end start()
*/
	public void makeDeposit(Scanner scanner) {
	       	System.out.print("Enter the amount to deposit: ");
		/*
        	double amount = scanner.nextDouble();
        	balance += amount;
        	System.out.println("You deposited $" + amount + ". New balance: $" + balance);*/
    }

    	public void makeWithdrawal(Scanner scanner) {
	   	System.out.print("Enter the amount to withdraw: ");
	    	/*double amount = scanner.nextDouble();

	    	if (amount <= 0) {
			System.out.print("Withdrawal amount must be positive");
	    	}
	    	else if (amount > balance) {
			System.out.print();*/ 
    }

    	public void checkBalance() {
		System.out.print("You're in checkBalance()");
	}

}// end class CheckingAccount
