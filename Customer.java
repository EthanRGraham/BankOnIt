import java.util.Scanner;
import java.io.Serializable;

public class Customer extends User implements Serializable {
	
	CheckingAccount checking;
    	SavingsAccount savings;

	public static void main(String[] args) {
		Customer customer = new Customer();
		if (customer.login()) {
			customer.start();
		}
	}

	public Customer() {
		this.userName = "Alice";
		this.PIN = "0000";
		checking = new CheckingAccount();
		savings = new SavingsAccount();
	}

	public Customer(String userName, String PIN) {
		this.userName = userName;
		this.PIN = PIN;
		checking = new CheckingAccount();
		savings = new SavingsAccount();
	} 

	public String Menu() {
        System.out.println("\n===== Customer Menu =====\n");
        System.out.println("0. Quit");
	System.out.println("1. Manage Checking Account");
        System.out.println("2. Manage Saving Account");
        System.out.println("3. Change PIN");
        System.out.print("\nEnter your choice: ");

        Scanner input = new Scanner(System.in);
        return input.nextLine(); // returns user's menu choice
    }// end menu

    	public void start() {
		boolean keepGoing = true;

	    	while (keepGoing) {
			String response = Menu();
		     	if (response.equals("0")) {
				System.out.println("Goodbye, " + userName + "!");
                		keepGoing = false;
			}
			else if (response.equals("1")) {
				checking.start();
            		}
            		else if (response.equals("2")) {
                		savings.start();
            		}
			else if (response.equals("3")) {
				changePIN();
			}
            		else {
                		System.out.println("Please enter 0-3.");
			} // end if
        	} // end while
    	} // end start
	    
	public void changePIN(){
		Scanner input = new Scanner(System.in);
    		System.out.print("Enter your current PIN: ");
    		String current = input.nextLine();

    		if (current.equals(PIN)) {
			System.out.print("Enter your new PIN: ");
        		String newPIN = input.nextLine();
        		PIN = newPIN;
       			System.out.println("PIN successfully changed!");
		}
		else {
        		System.out.println("Incorrect current PIN.");
		}
	}
	public String getReport() {
		return "\n=== Customer Report ===" +
               "\nName: " + userName +
               "\nChecking Balance: $" + checking.getBalanceString() +
               "\nSavings Balance: $" + savings.getBalanceString() +
               "\nSavings Interest Rate: " + savings.getInterestRate() + "%" +
               "\n=========================";
	  } // end getReport()
}

