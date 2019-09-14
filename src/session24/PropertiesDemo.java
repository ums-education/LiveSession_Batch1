package session24;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		// Properties is a sub-class of HashTable
		//				aka extends HashTable
		
		FileReader reader = new FileReader("src/test.properties");
		
		Properties properties = new Properties();
		properties.load(reader);
		
		
		System.out.println( properties.get("login") );
		System.out.println( properties.get("159") );
		System.out.println( properties.get("name") );
	}
}
