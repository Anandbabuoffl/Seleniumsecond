package Simpleuitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.name("employees_c"));
		Select s=new Select(dropdown);
		s.selectByIndex(3);
		Thread.sleep(200);
     	s.selectByValue("level3");
		Thread.sleep(200);
		s.selectByVisibleText("1 - 10 employees");
		
	}

}
