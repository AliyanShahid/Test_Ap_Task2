package task2;



import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;
import org.junit.Assert;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import task2.Account;
import task2.create_account;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test {
	private create_account objacc;
	@Before
	public void setUp() throws Exception {
		objacc=new create_account();
	}

	@Test
	public void testdeposit() {
		 int bal=100,acc=123;
		 int expectedresult=100;
		 int result=objacc.deposite(acc, bal);
		 Assert.assertEquals(expectedresult,result,0.0);
	}
	
	@Test
	public void testwithdraw() {
		 int wd=100;
		 int expectedresult=100;
		 int result=objacc.withdraw(wd);
		 Assert.assertEquals(expectedresult,result,0.0);
	}



}





