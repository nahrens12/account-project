package convert_jsontojava;

import java.util.Map;

import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
import com.google.gson.GsonBuilder;

import account_admin.Account;

public class Json {
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	
	public String JsonConverter(Map<Integer, Account> accountMap)
	{
		return gson.toJson(accountMap);
	}

}
