package com.app.Accounts;
import com.app.exceptions.*;

public class CurrentAccount extends Account{
	// Default constructor...
			public CurrentAccount(){
//				System.out.println("HIHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
//				super();
			} 

			public boolean withdrawl(double balance){
				double cur_balance = getCurrentBalance();
				double remaining = cur_balance - balance;
				if( remaining >= 0 ){
					setCurrentBalance( remaining ); // if currentBalance falls below 1000, remove this account
//					System.out.println("\n\tAmount withdrawled successfully!");
					return true;
				}
				
				else{
					
					try{
						throw new InvalidWithdrawlAmountException("InvalidWithdrawlAmountException");
						
					}catch(InvalidWithdrawlAmountException msg){
//						System.out.println("Current  Balance: "+cur_balance);
//						System.out.println("Requeted Balance: "+balance);
//						System.out.println("\nSorry, you must have an amount greater than Rs.0  in your account: "+ msg);
						
					}
					return false;
				}
			}
}
