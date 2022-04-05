
package Simpleuitest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Differentlocators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://dev.to/");
		driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.id("user-name")).sendKeys("ANAND");
		//driver.findElement(By.name("user-name")).sendKeys("ANAND");
       //driver.findElement(By.cssSelector("#user-name")).sendKeys("test");
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("test");
		//driver.findElement(By.tagName("input")).sendKeys("test");
		//driver.findElement(By.linkText("Podcasts")).click();
		//driver.findElement(By.partialLinkText("Policy")).click();
	}

}
//*[@id="input"]
