package atm;
import javax.swing.JOptionPane;

/**
 * This class handles bank account transactions using a BankAccount object.
 * It provides methods to get user input for deposits and withdrawals
 * via dialog boxes, and performs the corresponding operations on the account.
 * 
 * It includes a main method to run an interactive/visual transaction.
* @author Hannah Reynolds 
* @version 1.0
* @since 08 Feb 2026
*/

public class Transactions
{
	/**
	 * Stores user's answer to the first question 'would you like to make a deposit?'
	 */
	public int answer1;
	/**
	 * Stores user's answer to the second question 'would you like to make a withdrawal?'
	 */
	public int answer2;
	/**
	 * Stores user's input to the amount they want to deposit/withdraw
	 */
	public int amount;
	/**
	 * Sets withdrawOK initially to true
	 */
	public boolean withdrawOK = true;
	/**
	 * Creates a BankAccount object ba
	 */
	public BankAccount ba;
	
	/**
     * Default constructor.
     * Initializes the transaction fields 
     * and creates a BankAccount with an initial balance of 1000.
     */
	public Transactions() {
    	answer1=0;
    	answer2=0;
    	amount=0;
    	ba = new BankAccount(1000);
    	
    }
    
	/**
	 * Main method that starts a transaction.
     * Creates a Transactions object and calls getInput to interact with the user.
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args)
	{
	  Transactions transaction = new Transactions();
	  transaction.getInput();
	  System.exit(0);
		  
	  }
	   
	/**
     * Asks the user if they want to perform a deposit using a dialogue box. 
     * If the user selects 'yes, it prompts them to enter an amount, and a box appears with the updated balance.
     * If the user selects 'no', it asks the user if they want to make a withdrawal using a dialogue box.
     * If the user selects 'yes', it prompts them to enter an amount.
     * If there are sufficient funds, a text box appears with the updated balance.
     * If there aren't sufficient funds, a text box appears explaining the error. 
     * If the user selects 'no' to a withdrawal, a text box appears with their account balance. 
     */
   public void getInput() {	   
	   answer1 = JOptionPane.showConfirmDialog(null,
	                "Make a Deposit?", null, JOptionPane.YES_NO_OPTION);
	     
	   if (answer1 == JOptionPane.YES_OPTION){
	    	  String depString =
	    		         JOptionPane.showInputDialog(
	    		                               "Enter amount:");
	    	  amount = Integer.parseInt(depString);
	    	 
	    	  ba.deposit(amount);
	    	
	    		     
	      }
	   
	   else if (answer1 == JOptionPane.NO_OPTION){
		   answer2 = JOptionPane.showConfirmDialog(null,
	                "Make a Withdraw?", null, JOptionPane.YES_NO_OPTION);
	   
		   if (answer2 == JOptionPane.YES_OPTION){
		    	  String withString =
		    		         JOptionPane.showInputDialog(
		    		                               "Enter amount:");
		    	  amount = Integer.parseInt(withString);
		    	  
		    	  withdrawOK = ba.withdraw(amount);
		    	  
	   
	   }
		 
			
	   }
	   if (!withdrawOK)
		   JOptionPane.showMessageDialog(
			         null, "Your Balance  = " + ba.getBalance()+ " which is not enough for this withdraw ");
	   else
		   JOptionPane.showMessageDialog( 
				     null, " Your balance is " + ba.getBalance());

		      	   
	      }
}
