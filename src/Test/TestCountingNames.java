package Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import account_admin.Account;
import account_admin.Service;

public class TestCountingNames {

	private Service service; 
	
	@Before
	public void setUp()
	{
		service = new Service();

		service.addAccount(new Account("zak" ,"mohamed","765"));
		service.addAccount(new Account("daniel","okoro","345"));	
		service.addAccount(new Account("daniel","douche","365"));
		service.addAccount(new Account("daniel","wasteman","385"));
	}
	
	@Test
	public void testSearchNames() {
		
		assertEquals(3, service.countNames("daniel"));
	}


}
