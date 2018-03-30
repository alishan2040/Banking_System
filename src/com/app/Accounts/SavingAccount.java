package com.app.Accounts;
import com.app.exceptions.*;
import java.util.Scanner;

public class SavingAccount extends Account {
	Scanner input;
	// Default constructor...
		public SavingAccount(){
			input = new Scanner(System.in);
			//super();
		} 
		
		public boolean withdrawl(double balance){
			double cur_balance = getCurrentBalance();
			double remaining = cur_balance - balance;
			if( remaining >= 5000 ){
				/*setCurrentBalance( remaining );// if currentBalance falls below 1000, remove this account
				System.out.println("\n\tAmount withdrawled successfully!");
				return true;*/
				double alreadyAmount = getAmountWithdrawl();
				alreadyAmount += balance;
				try{
					if( alreadyAmount > 25000.0){	// Checking withdraw Amount Limit
						
						throw new InvalidWithdrawlAmountException("");		
					}
					else{
						setCurrentBalance( remaining ); 
						setAmountWithdrawl(alreadyAmount);
//						System.out.println("\n\tAmount withdrawled successfully!");
//						System.out.println("Withdraw  Amount: "+balance);
//						System.out.println("Current  Balance: "+remaining);
						return true;
					}
				}catch(InvalidWithdrawlAmountException msg){
//						System.out.println("Current  Balance: "+cur_balance+"/-");
//						System.out.println("Requeted Balance: "+balance+"/-");
//						
//						System.out.println("\nSorry, Withdrawal limit of RS 25,000 per day only : "+ msg);
					}	 
					return true;	
			}
			
			else{
				
				try{
					throw new InvalidWithdrawlAmountException("");
					
				}catch(InvalidWithdrawlAmountException msg){
//					System.out.println("\nSorry, you must have Rs.5000 in your account(if you proceed, your account would be close!): "+ msg);
//					System.out.println("Do you want to proceed ?(y/n)");
					char yORn = 'y';//input.next().charAt(0);
					if( yORn == 'y' || yORn == 'Y' ){
//						System.out.println("Your Saving Account has been closed...");
						return false;
					}
					else{
						return true;
					}
					
				}
			}
		}	
}
