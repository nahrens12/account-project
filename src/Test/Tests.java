package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import account_admin.Account;
import account_admin.Service;

public class Tests {
	private Service service;
	
	@Before
	public void setUp()
	{
		
		service = new Service();

		service.addAccount(new Account("zak","mohamed","765"));
		service.addAccount(new Account("daniel","okoro","345"));	

	}
	
	@Test
	public void testRetrieveAccount()
	{
		Account account = service.retrieveAccount(1);
		
		assertEquals("765", account.getAccountNumber());
	}
	
	@Test
	public void testAddAccount()
	{
		service.addAccount(new Account("zak","mohamed","765"));
		assertEquals(1, service.retrieveAccount(1).getFirstName() );
	}

}
