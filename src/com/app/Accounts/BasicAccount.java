package com.app.Accounts;
import com.app.exceptions.*;
public class BasicAccount extends Account {
	
	// Default constructor...
	public BasicAccount(){
	
	} 
	
	public boolean withdrawl(double balance){
		
		
		double cur_balance = getCurrentBalance();
		
		double remaining = cur_balance - balance;
		
		if( remaining >= 0 ){
		
			double alreadyAmount = getAmountWithdrawl();
			
			alreadyAmount += balance;
			
			try{
			
				if( alreadyAmount > 30000.0){	// Checking withdraw Amount Limit
					
					throw new InvalidWithdrawlAmountException("");		
				}
				else{
				
					setCurrentBalance( remaining ); 
					
					setAmountWithdrawl(alreadyAmount);
					
//					System.out.println("Withdraw  Amount: "+balance);
//					
//					System.out.println("Current  Balance: "+remaining);
//					
//					System.out.println("\n\t\tAmount withdrawled successfully!");
					
					return true;
				}
				
			}catch(InvalidWithdrawlAmountException msg){
				
//					System.out.println("Current  Balance: "+cur_balance+"/-");
//					
//					System.out.println("Requeted Balance: "+balance+"/-");
//					
//					System.out.println("\nSorry, Withdrawal limit of RS 30,000 per day only : "+ msg);
				}	 
				return false;	
		}
		
		else{
			
			try{
				throw new InvalidWithdrawlAmountException("");
				
			}catch(InvalidWithdrawlAmountException msg){
				
//				System.out.println("Current  Balance: "+cur_balance);
//				
//				System.out.println("Requeted Balance: "+balance);
//				
//				System.out.println("\nSorry, your account is insufficient for this request: "+ msg);
			}	 
			return false;
		}
	}
}
