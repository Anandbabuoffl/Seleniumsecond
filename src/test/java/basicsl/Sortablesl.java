package basicsl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortablesl {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		
		List <WebElement> elements=driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		
		String l=elements.get(5).getText();
		System.out.println(l);
		
		WebElement from=elements.get(6);
		WebElement to=elements.get(1);
		
		Actions action=new Actions(driver);
		
		action.clickAndHold(from);
		action.moveToElement(to);
		action.release(to);
		action.build().perform();
		
		WebElement from1=elements.get(5);
		WebElement to1=elements.get(0);
		
		action.clickAndHold(from1);
		action.moveToElement(to1);
		action.release(to1);
		action.build().perform();
	}

}
