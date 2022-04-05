package basicsl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertl {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/");
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		WebElement alert=driver.findElement(By.cssSelector("button[onclick='normalAlert()']"));
		alert.click();
		
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.accept();
		
		WebElement conformalert=driver.findElement(By.cssSelector("button[onclick='confirmAlert()']"));
		conformalert.click();
		Thread.sleep(3000);
		Alert conformalert1=driver.switchTo().alert();
		Thread.sleep(3000);
		conformalert1.dismiss();
		
		WebElement textalert=driver.findElement(By.cssSelector("button[onclick='confirmPrompt()']"));
		textalert.click();
		Thread.sleep(3000);
		Alert textalert1=driver.switchTo().alert();
		Thread.sleep(3000);
		textalert1.sendKeys("Load");
		textalert1.accept();
		
		
		
		
		

	}

}
