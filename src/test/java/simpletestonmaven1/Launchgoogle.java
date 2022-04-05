package simpletestonmaven1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchgoogle {

	public static void main(String[] args) {
		//System.setProperty("Webdriver.edge.driver","C:/Browserdrivers/msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
	    driver.get("https://www.google.com/");
	   String name= driver.findElement(By.name("q")).getAttribute("class");
	   System.out.println(name);
	   driver.manage().deleteAllCookies();
	}

}
