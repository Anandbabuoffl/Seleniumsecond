package methodsinwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrivermethods {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
        EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.name("firstname")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
		System.out.println(driver.findElement(By.name("account_name")).getCssValue("display"));
		System.out.println(driver.findElement(By.name("account_name")).getSize());
		System.out.println(driver.findElement(By.name("account_name")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field31\"]/div/div")).getText());
		System.out.println(driver.findElement(By.name("account_name")).getTagName());
		System.out.println(driver.findElement(By.name("account_name")).isDisplayed());
		System.out.println(driver.findElement(By.name("account_name")).isEnabled());
		System.out.println(driver.findElement(By.name("account_name")).isSelected());
		
		

	}

}
