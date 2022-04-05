package Simpleuitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relativelocators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	WebElement password=driver.findElement(By.id("password"));
	driver.findElement(with(By.tagName("input")).above(password)).sendKeys("testing");
    WebElement username=driver.findElement(By.id("user-name"));
    driver.findElement(with(By.tagName("input")).below(username)).sendKeys("23823");
	}

		

}
