package basicsl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectablel {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List <WebElement> multiselect=driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL);
		action.click(multiselect.get(0)).click(multiselect.get(1)).click(multiselect.get(2)).build().perform();
		action.release().build().perform();
		action.click(multiselect.get(4)).build().perform();
		
		//action.clickAndHold(multiselect.get(0));
		action.clickAndHold(multiselect.get(1));
		action.clickAndHold(multiselect.get(2));
		action.build().perform();
		
		
		
		
	}

}
