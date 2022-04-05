package basicsl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Imagesl {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		WebElement isbrokenimg=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		
		if(isbrokenimg.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The img is broken");
		}else {
			System.out.println("The img is not broken");
		}
		

	}

}
