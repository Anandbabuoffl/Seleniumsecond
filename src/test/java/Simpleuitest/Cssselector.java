package Simpleuitest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cssselector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.get("http://demo.guru99.com/test/newtours/");
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("test"); //Cssselector format //tagname[attribute='value']
		driver.get("https://www.saucedemo.com/");
	//driver.findElement(By.cssSelector("input#user-name")).sendKeys("Test"); 
	//use id attribute to access web element through cssselector //tagname#value
	driver.findElement(By.cssSelector("input#user-name[type='text'][class='input_error form_input']")).sendKeys("Test");
	//using multiple attribute to find web element in css selector tagname#idvalue[att='value'][att='value']
	
		//driver.close();
		
	}

}
