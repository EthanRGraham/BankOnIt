

import java.util.*;
import java.io.*;

public class Admin extends User implements Serializable {
	
	public Admin() {
		this.userName =  "admin";
       		this.PIN = "0000";
    }

	public static void main(String[] args){
		Admin a = new Admin();
		a.login();
	}// end main
	

	public String Menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n ====Admin Menu====\n");
		System.out.println("0. Exit");
		System.out.println("1. Full Customer Report");
		System.out.println("2. Add a user");
		System.out.println("3. Apply interest\n");
		System.out.println("0-3\nEnter your choice: ");
		String result = input.nextLine();
		return result;

		
	}// end menu
	

	public void start() {

	} //end start 

	public String getReport(){
		return "Admin Report\nUsername: " + this.getUserName() + "\nPIN: " + this.getPIN();
	}// end getReport

}// end Admin class
