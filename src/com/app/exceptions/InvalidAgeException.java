package com.app.exceptions;
public class InvalidAgeException extends Exception{
	public InvalidAgeException(int age){
		super();
		//checkAge(age);
	}
	/*public boolean checkAge(int age){
		if(age <= 0 || age >= 110){
			return true;
		}
		else
			return false;
	}*/
}
