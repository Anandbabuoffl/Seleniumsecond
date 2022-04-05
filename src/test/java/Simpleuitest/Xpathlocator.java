package Simpleuitest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathlocator {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();//xpath format //tagname[@attribute="values"]
	ChromeDriver driver=new ChromeDriver();
	/*driver.get("https://phptravels.org/index.php?rp=/login");//starts-with xpath format //tagname[start-with(@attribute,'value')]
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test");
	driver.findElement(By.xpath("//input[starts-with(@name,'password')]")).sendKeys("12323");*/
	//driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	//driver.findElement(By.xpath("//input[contains(@name,\"email_create\")]")).sendKeys("Anand");
	//contains xpath format //tagname[contains(@attribute,'value')]
 //driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click(); 
	//text() xpath format //tagname[text()='Actualtext']
 //driver.findElement(By.xpath("//input[@name='email'and@class='is_required validate account_input form-control']")).sendKeys("Arun");
 //AND/OR operator xpath format //tagname[@attribute='value'and@attribute='value']
//tagname[@attribute='value'or@attribute='value']
	driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
	driver.findElement(By.xpath("//select[@id='selectProductSort']//self::option")).click(); 
	//Axes menthods  xpath //tagname[@attribute='value']//parent::tagname
	//xpath //tagname[@attribute='value']//child::tagname
	//xpath //tagname[@attribute='value']//self::tagname
	
 
	}
	

}
