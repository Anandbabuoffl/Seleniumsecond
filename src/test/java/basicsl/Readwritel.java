package basicsl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Readwritel {

	public static void main(String[] args) throws IOException {
		Properties properties=new Properties();
		FileInputStream input=new FileInputStream("C:/Users/bbuanan/eclipse-workspace/Selenium/src/test/resources/Properties/testdata.properties");
		properties.load(input);
		String b=properties.getProperty("Browser");
		System.out.println(b);
		String u=properties.getProperty("url");
		System.out.println(u);
		
		FileOutputStream output=new FileOutputStream("C://Users//bbuanan//eclipse-workspace//Selenium//src//test//resources//Properties//testdata.properties");
		properties.setProperty("testdata1", "5235763");
		properties.store(output,"customerid");
	}

}
