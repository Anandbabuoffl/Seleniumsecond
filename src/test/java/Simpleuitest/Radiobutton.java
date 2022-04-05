package Simpleuitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
	List<WebElement> a=driver.findElements(By.name("webform"));
	System.out.println(a.size());
		//a.click();
		//System.out.println(a.isSelected());
		
	}

}
