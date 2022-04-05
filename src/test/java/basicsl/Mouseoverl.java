package basicsl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseoverl {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.thefreedictionary.com/elects");
		WebElement mouseover=driver.findElement(By.xpath("//*[@id=\"nav\"]/ul/li[2]/a/span"));
		
		Actions action=new Actions(driver);
		action.moveToElement(mouseover).perform();
		
		
	}

}
