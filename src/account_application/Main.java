package account_application;

import java.util.Map;

import account_admin.Account;
import account_admin.Service;
import convert_jsontojava.Json;

public class Main {
	
	static Service service;
	
	public Main() {
		service = new Service();

		this.service.addAccount(new Account("zak","mohamed","765"));
		this.service.addAccount(new Account("daniel","okoro","345"));	
	}
	
	public void printAccountByKey(int key) {
		Account account = this.service.retrieveAccount(key);
		System.out.println("First Name: "+account.getFirstName());
		System.out.println("Last Name: "+account.getLastName());
		System.out.println("Account Number: "+account.getAccountNumber());	
	}
	
	public void run() {
		this.printAccountByKey(987);
	}
	
	public static void main(String[] args){
		
		new Main().run();
		Map<Integer, Account> accountMap = service.getAccounts(); 
		Json convert = new Json();
		
		String jsonConvert = convert.JsonConverter(accountMap);
		System.out.println(jsonConvert);
	}
	
}
