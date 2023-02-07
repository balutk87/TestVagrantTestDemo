package Demo.TestComponents;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class BaseTest {

	public JSONArray parseJson(String path) throws IOException, ParseException {

		JSONParser jsonParser = new JSONParser();

		FileReader reader = new FileReader(path);

		// java object
		Object obj = jsonParser.parse(reader);

		// convert into json object

		JSONObject crickJsonObj = (JSONObject) obj;

		JSONArray jsonarray = (JSONArray) crickJsonObj.get("player");

		return jsonarray;

	}

}
