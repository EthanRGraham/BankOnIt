

import java.io.Serializable;
import java.util.Scanner;

public abstract class User implements HasMenu, Serializable {
	String userName;
	String PIN;	

	public User(){
	this.userName = "";
	this.PIN = "0000";
	}

	public User(String userName, String PIN) {
		this.userName = userName;
		this.PIN = PIN;
	}

	public boolean login() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter Your Username: ");
		String usernameInput = input.nextLine();

		System.out.print("\n Enter Your Pin: ");
		String pinInput = input.nextLine();

		if (usernameInput.equals(this.userName) && pinInput.equals(this.PIN)) {
			System.out.println("\nLogin Successful\nWelcome " + this.userName + "!");
			return true;
		} // if
		else {
			System.out.println("\n invalid Username or Pin, please try again.\n");
			return false;
		}// else
	}// end login

	public boolean login(String userName, String PIN) {
		if (this.userName.equals(userName) && this.PIN.equals(PIN)) {
			// if userName and PIN both match:
			System.out.println("Login successful!");
            		return true;
		} 
		else {
           		 System.out.println("Invalid username or PIN.");
           		 return false;
		} // end else
	}// end login
	
	void setUserName(String userName) {
		this.userName = userName;
	}// end setUserName

	String getUserName() {
		return userName;
	}// end getUserName

	void setPIN(String PIN) {
		this.PIN = PIN;
	}// end setPIN
	
	String getPIN() {
		return PIN;
	} // end getPIN
	
	public abstract String getReport(); // for subclasses Customer and Admin

} // end User Class
