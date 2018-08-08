package account_admin;

import java.util.HashMap;
import java.util.Map;

public class Service {
	private Map<String, Account> accounts;  
	
	public Service() {
		accounts = new HashMap <String, Account>();
	}
	 
	public void addAccount(String key, Account account)
	{
		this.accounts.put(key,account);	
	}
	
	public Account retrieveAccount(String key)
	{
		return accounts.get(key); 	
	}
	
}
