package atm;

/**
* This class represents a bank account with a balance.
* It provides constructors to create a bank account
* and methods to deposit, withdraw, and check the balance.
* @author Hannah Reynolds 24421712
* @version 1.0
* @since 08 Feb 2026
*/

public class BankAccount {

	/**
     * The current balance of the bank account.
    */
    private double balance;

    /**
    * Default constructor.
    * Creates a bank account with a balance of 0.
    */
	public BankAccount()
	{
		balance = 0;
	}
	
	/**
	* Constructor that creates a bank account with a specified amount.
	* @param initialBalance initial balance of the account
	*/
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}
	
	/**
	* Method to deposit a specified amount into the account.
	* @param amount amount the user wants to deposit
	*/
	public void deposit(double amount)
	   {      
		balance = balance + amount;
	       
	    } 
	
	/**
	* Method to withdraw a specified amount from the account.
	* If there are sufficient funds, the amount is withdrawn and the method returns true.
	* If there are not sufficient funds, nothing is withdrawn and the method returns false.
	* @param amount amount the user wants to withdraw
	* @return returns true or false depending on current balance and amount specified 
	*/
	public boolean withdraw(double amount)    
	{ 
		if (balance>= amount)
			{
			balance = balance - amount;
			return true;
			}
		else
			return false;
        
    } 
	
	/**
	* Method that returns the current balance of the account.
	* @return returns the current balance in the bank account
	*/
	public double getBalance() 
	{ 
		return balance;
	}
}
