package Demo.Tests;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Demo.Constants.Constant;
import Demo.TestComponents.BaseTest;

public class Team extends BaseTest {

	
	//Validate that team has only 4 Foreign players
	@Test(priority = 1)
	public void foreignPlayersCount() throws IOException, ParseException {

		//parcing the json
		JSONArray getdata = parseJson(Constant.getFilepath());

		int count = 0;
		for (int i = 0; i < getdata.size(); i++) {

			JSONObject palyer = (JSONObject) getdata.get(i);

			String country = (String) palyer.get("country");

			if (!country.equalsIgnoreCase("India")) {

				count++;
			}

		}
		
		System.out.println("Foreign Players Count :"+count);
//Validation
		Assert.assertTrue(count <= 4);

	}

	//Validate that there is at least one wicket keeper 
	@Test(priority = 2)
	public void WicketKeeperCount() throws IOException, ParseException {

		JSONArray getdata = parseJson(Constant.getFilepath());

		int count = 0;
		for (int i = 0; i < getdata.size(); i++) {

			JSONObject palyer = (JSONObject) getdata.get(i);

			String role = (String) palyer.get("role");

			if (role.equalsIgnoreCase("Wicket-keeper")) {

				count++;
			}

		}
		System.out.println("Wicket-keeper Count :"+count);

		//Validation
		
		Assert.assertTrue(count >= 1);

	}

}
