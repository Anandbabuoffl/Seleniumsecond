package basicsl;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseprintl {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		
	
		 WebElement M=driver.findElement(By.xpath("//a[@class='btnMouse']"));
		Actions action=new Actions(driver);
		action.moveToElement(M).perform();
		
		List <WebElement> s=driver.findElements(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/ul"));
				for (WebElement alllinks : s) {
				String a=alllinks.getText();
					System.out.println(a);
		
		 WebElement E=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/ul/li[1]/a"));
		 E.click();
		
		 Alert alert=driver.switchTo().alert();
		 alert.accept();
		
			
		}
		
		
		}
		
}

	


