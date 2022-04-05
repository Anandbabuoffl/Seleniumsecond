package basicsl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltipl {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
	WebElement tooltip1=driver.findElement(By.id("age"));
	Actions action=new Actions(driver);
	action.moveToElement(tooltip1).click().build().perform();
	
     String text=tooltip1.getAttribute("title");
     System.out.println(text);
	
	
	}

}
