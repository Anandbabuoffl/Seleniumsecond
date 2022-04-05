package basicsl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framesl {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		//driver.switchTo().frame(0);
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"wrapframe\"]/iframe"));
		driver.switchTo().frame(frame);
		WebElement click1=driver.findElement(By.id("Click"));
		click1.click();
		
		String text=click1.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement click2=driver.findElement(By.id("Click1"));
		click2.click();
		
		driver.switchTo().defaultContent();
		
	   List <WebElement> alltags=driver.findElements(By.tagName("iframe"));
	  int size= alltags.size();
		System.out.println(size);
		
				

	}

}
