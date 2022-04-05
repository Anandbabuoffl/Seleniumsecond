package simpletestonmaven1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simpleprogram {

	

		public static void main(String[] args) {
			//System.setProperty("webdriver.chrome.driver","C:/Users/bbuanan/Pictures/Browserdrivers/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	}

}
