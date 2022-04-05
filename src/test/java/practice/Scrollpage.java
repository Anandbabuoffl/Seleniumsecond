package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import methodsinwebdriver.Webdrivermethods;

public class Scrollpage {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.opencart.com/");
		WebElement e=driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xl']"));

		JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0,1000)");
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView()",e);
		
		
		
	}

}
