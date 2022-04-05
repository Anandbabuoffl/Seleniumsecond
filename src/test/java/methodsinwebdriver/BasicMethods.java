package methodsinwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		/*driver.get("https://developer.salesforce.com/signup");
		driver.manage().window().maximize();
		
		String s=driver.getCurrentUrl();
		System.out.println("Current url page is "+s);
		
		String s1=driver.getTitle();
		System.out.println("Title is "+s1);
		
		String s2=driver.getPageSource();
		System.out.println("Page souce is "+s2);*/
		
		//driver.navigate().to("https://www.dictionary.com/browse/wed");
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input[type='password']")).clear();
		driver.findElement(By.xpath("//input[starts-with(@id,'login-button')]")).click();
		
		
		//driver.close();
		
	}

}
