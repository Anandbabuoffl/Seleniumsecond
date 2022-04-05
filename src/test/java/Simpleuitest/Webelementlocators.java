package Simpleuitest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelementlocators {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
   // driver.findElement(By.name("//input[@name='q']")).sendKeys("Test");
    driver.navigate().to("https://trytestingthis.netlify.app/");
    WebElement name=driver.findElement(By.id("fname"));
    name.sendKeys("Text");
    WebElement s= driver.findElement(By.id("fname"));
   driver.findElement(RelativeLocator.with(By.tagName("input")).below(s)).sendKeys("Test");
   
    
    
    
		

	}

}
