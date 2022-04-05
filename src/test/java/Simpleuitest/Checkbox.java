package Simpleuitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
	    //WebElement a=	driver.findElement(By.id("vfb-6-0"));
		//driver.findElement(RelativeLocator.with(By.id("vfb-6-1")).below(a)).click();		
       System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
     
}
}