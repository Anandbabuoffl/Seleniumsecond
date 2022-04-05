package basicsl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calenderl {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement text=driver.findElement(By.id("datepicker"));
		text.click();
		//text.sendKeys("01/10/2022");
		
		WebElement nextbutton=driver.findElement(By.xpath("//a[@title='Next']"));
		nextbutton.click();
		
		WebElement date=driver.findElement(By.xpath("//a[contains(text(),10)]"));
		date.click();
	}

}
