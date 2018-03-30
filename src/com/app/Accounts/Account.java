package com.app.Accounts;
import java.util.Date;
import com.app.exceptions.*;
import java.util.Scanner;

public class Account {

	private int accountID;
	private int custID;
	private char accountType;
	private double currentBalance;// it will be checked on the time of account creation...
	private Date createdDate;
	private char currency;
	private double amountWithdrawl;
	private double annualInterestRate;
	
	public Account(){
	}

//	abstract public boolean withdrawl(double m);

	public Account accountInfo(int aid,int CID,double currentBalance, double InterestRate, char accType){
		if (aid==0 || CID==0 )return null;
		custID   =  CID;
		accountID = aid;
		createdDate = new Date();	//system current date
		currency  = 'R';
		accountType = accType;
		this.currentBalance = currentBalance;
		this.annualInterestRate = InterestRate;
		amountWithdrawl = 0;
		return this;
	}
	
	public double WithDrawAmount(int accId , double Amount){
		
		if (Amount <= 0.0){
			
			return -1.0;
		}
		
		if (accId != 10001){
			
			return -1.0;
		}
		
		if (this.currentBalance >= Amount){
			
			this.currentBalance -= Amount ;
		}
		else {
			return -1.0;
		}
		
		return  Amount;
	}
	
	public boolean DepositAmount(int accId , double Amount){
		
		if (Amount <= 0.0){
			
			return false;
		}
		
		if (accId != 10001){
			
			return false;
		}
		
		this.currentBalance += Amount ;
		return true;
	}
	
	// Getters & Setters...[when calling setters, values should also be updated in file]
	
	public double getAmountWithdrawl(){
		return amountWithdrawl;
	}
	public void setAmountWithdrawl( double amt ){
		amountWithdrawl = amt;
	}
	
	public int getCustID(){
		return custID;
	}
	public char getAccountType(){
		return accountType;
	}
	public void setAccountType(char at){
		accountType = at;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setCustID(int cid){
		custID = cid;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public char getCurrency() {
		return currency;
	}

	public void setCurrency(char currency) {
		this.currency = currency;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
}//class Account end
