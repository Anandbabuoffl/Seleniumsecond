package basicsl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddropl {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");

		WebElement from=driver.findElement(By.id("draggable"));
		WebElement to=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		//action.clickAndHold(from).moveToElement(to).release().build().perform();
		action.dragAndDrop(from, to).build().perform();
		
		
	}

}
