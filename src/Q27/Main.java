package Q27;

import java.io.FileReader;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		
		FileReader fileReader = new FileReader("C:\Users\RAM\eclipse-workspace\Rampratap_Java\ram_evl\src\Q27\database");
		
		Properties properties = new Properties();
		properties.load(fileReader);
		
		System.out.println(properties.getProperty(username));
		System.out.println(properties.getProperty(password));
		
		
	}
	
}
