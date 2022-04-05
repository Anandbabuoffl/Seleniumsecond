package basicsl;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentl {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tatacliq.com/womens-lifestyle?&icid2=catd:nav:regu:wnav:m10:mulb:bst:12:R1");
		driver.manage().window().maximize();
        
		//WebElement later=driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]"));
		//later.click();
		WebElement show=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(show).perform();
		
		
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(20))
		.pollingEvery(Duration.ofSeconds(2))
		.withMessage("Test")
		.ignoring(NoSuchElementException.class);
		WebElement later=driver.findElement(By.xpath("//*[@id=\"wzrk-canceldhajsd\"]"));
		wait.until(ExpectedConditions.visibilityOf(later));
		later.click();
		
		
	}

	
	}


