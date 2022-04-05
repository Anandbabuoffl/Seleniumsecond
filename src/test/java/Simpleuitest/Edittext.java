package Simpleuitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edittext {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement emailbox=driver.findElement(By.id("email"));
		emailbox.sendKeys("Test");
		
	WebElement addtext=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
	addtext.sendKeys("text");
	
	WebElement gettext=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
	System.out.println(gettext.getAttribute("value"));
	
	WebElement cleartext=driver.findElement(By.xpath("//input[@name='username'][@value='Clear me!!']"));
	cleartext.clear();
	
	WebElement enable=driver.findElement(By.xpath("//input[@type='text'][@disabled='true']"));
	System.out.println(enable.isEnabled());

	}

}
