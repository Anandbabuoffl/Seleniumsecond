package basicsl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwaitl {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tatacliq.com/womens-lifestyle?&icid2=catd:nav:regu:wnav:m10:mulb:bst:12:R1");
		driver.manage().window().maximize();
        
		WebElement later=driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]"));
		later.click();
		WebElement show=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(show).perform();
		
	
		WebElement clear=driver.findElement(By.xpath("/html/body/div/a"));
		clear.click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(clear));
		
	     //WebElement show1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/a[4]"));
		//show.click();
	}

}
