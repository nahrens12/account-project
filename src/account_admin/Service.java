package account_admin;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	private int counter = 0;
	private Map<Integer, Account> accounts;  

	public Service() {
		accounts = new HashMap <Integer, Account>();
	}
	

	public void addAccount(Account account)
	{
		this.accounts.put(counter,account);	
		counter++;
	}
	
	public Account retrieveAccount(int key)
	{
		return accounts.get(key); 	
	}
	
	public Map<Integer, Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<Integer, Account> accounts) {
		this.accounts = accounts;
	}
	
	
}
