package basicsl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatoraxesxpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		WebElement firstname=driver.findElement(By.xpath("//input[@name='lastname']/preceding::input[1]"));
		firstname.sendKeys("Test");
		
		
		WebElement title=driver.findElement(By.xpath("//input[@name='firstname']/following::input[4]"));
		title.sendKeys("Test");

	}

}
