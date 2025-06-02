package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//creating object of properties class which is available in java
		Properties propertiesobj = new Properties();
		
		//opening file in reading mode
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		//loading the properties file
		propertiesobj.load(file);
		
		//reading data from properties file
		String url = propertiesobj.getProperty("appurl");  //returns the value of appurl from properties file
		String email = propertiesobj.getProperty("email");
		String pwd = propertiesobj.getProperty("password");
		String odrid = propertiesobj.getProperty("orderid");
		String custid = propertiesobj.getProperty("customerid");
		
		System.out.println(url+" "+email+" "+pwd+" "+odrid+" "+custid+" ");
		
		//reading all the keys from properties file
		//1) first approach
		Set<String> keys = propertiesobj.stringPropertyNames();
		System.out.println(keys);
		
		//2) second approach
		Set<Object> keys1 = propertiesobj.keySet();
		System.out.println(keys1);
		
		//reding all the values from properties file
		Collection<Object> values = propertiesobj.values();
		
		file.close();

	}

}
