package Demo.Constants;

public class Constant {

	
	private static String filepath= System.getProperty("user.dir")+"\\src\\test\\java\\Demo\\data\\teamRCB.json";


	public static void setFilepath(String filepath) {
		Constant.filepath = filepath;
	} 
	
	public static String getFilepath() {
		return filepath;
	}

	
	
}
