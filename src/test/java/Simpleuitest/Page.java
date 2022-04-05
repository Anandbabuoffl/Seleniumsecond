package Simpleuitest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C:/Browserdrivers/geckodriver.exe" );
		WebDriverManager.chromedriver().setup();
		ChromeDriver div=new ChromeDriver();
		div.get("https://accounts.google.com/o/oauth2/device/usercode?flowName=DeviceOAuth");
	}

}
