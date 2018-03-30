package com.app.Accounts.Testing;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.Accounts.Account;

public class AccountTesting {

	private Account testAccount;   // Declare Testing Class Instance........
	
	// This method calls on each testcase invocation.....
	@Before
	public void setUp() throws Exception {
		
//		System.out.println("Start Account Class Testing");
		testAccount = new Account();        // Initialize Testing Class Instance......
		testAccount.setAccountID(10001);
		testAccount.setAccountType('S');
		testAccount.setCurrentBalance(10000.0);
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("Test Failed");
		
	}
	
	@Test
	public void accountInfoTestCase() {
		
		Account acc = testAccount.accountInfo(0, 0, 0, 0, 't');
		
		boolean expected = true;
		boolean actual = acc != null;
		assertEquals(expected , actual);
		
		//fail("Not yet implemented");
	}
	
	
}
