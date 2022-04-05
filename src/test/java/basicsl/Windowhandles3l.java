package basicsl;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles3l {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		WebElement window1=driver.findElement(By.id("color"));
		window1.click();
		
	Set <String> newwindows=driver.getWindowHandles();
	
	for (String allwindows : newwindows) {
		if(!allwindows.equals(window1));
		driver.switchTo().window(allwindows);
		driver.close();
		
	}
	}
		
	}


