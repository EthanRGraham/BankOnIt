# BankOnIt
    import java.util.Scanner;


# HasMenu()

   public interface HasMenu () 
  ====================
  ====================
  string menu()  return menu as a string

  void start()

  ====================

# class CheckingAccount implements HasMenu 
    
    private double balance = 0.0 // initital starting balance
    
    public CheckingAccount 
    
    balance = 0.0;
    

## String Menu()
    =================================   
    0) Quit
    1) Check Balance
    2) Make Deposit
    3) Make Withdrawal
    ===================================    


    take in user's input and return their choice.
    implement start()

    checkBalance(), makeDeposit(), and makeWithdrawal() are all called by menu choices
## public void start()
    new scanner(System.in)
    While keepGoing() = true
    
    int choice = scnner.nextint()
    Loop until user chooses “0”
    Call menu()
    
    choice =  1 -> checkBalance()
    2 -> makeDeposit()
    3 -> makeWithdrawal()
## checkBalance()
    print balance
## makeDeposit()
    ask for user input on how much they would like to deposit
    and add that to the balance
    print new balance(return balance?)
## makeWithdrawal
    ask for user input
    take that input and subtrack it from the current balance. 
    print new balance(return balance?)
