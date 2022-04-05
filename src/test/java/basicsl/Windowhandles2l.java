package basicsl;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles2l {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		WebElement window=driver.findElement(By.cssSelector("button[onclick='openWindows()']"));
		window.click();
		
		Set <String> allwindows=driver.getWindowHandles();
		
		int size=allwindows.size();
		System.out.println(size);
		
		

	}

}
