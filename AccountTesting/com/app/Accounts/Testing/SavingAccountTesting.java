package com.app.Accounts.Testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.Accounts.SavingAccount;

public class SavingAccountTesting {

private SavingAccount testAccount;   // Declare Testing Class Instance........
	
	// This method calls on each testcase invocation.....
	@Before
	public void setUp() throws Exception {
		
//		System.out.println("Start Account Class Testing");
		testAccount = new SavingAccount();        // Initialize Testing Class Instance......
		testAccount.setAccountID(10001);
		testAccount.setAccountType('S');
		testAccount.setCurrentBalance(10000.0);
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("Test Passed");
		
	}
	
	@Test
	public void withdrawTestCase() {
		boolean val = testAccount.withdrawl(4000.0);
		assertEquals(val, true);
	}
	
	@Test
	public void withdrawTestCase2() {
		testAccount.setAmountWithdrawl(33000);
		boolean val = testAccount.withdrawl(32000.0);
		assertEquals(val, false);
	}
	
	@Test
	public void withdrawTestCase3() {
		testAccount.setCurrentBalance(50000.0);
		boolean val = testAccount.withdrawl(32000.0);
		assertEquals(val, true);
	}

}
