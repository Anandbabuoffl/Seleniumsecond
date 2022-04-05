package basicsl;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitwaitl {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/?utm_source=Admitad&utm_medium=Affiliate&utm_campaign=db6cea52d39f3a8f9e6619b5a3fc885b");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement show=driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[1]/ul/li[3]/a"));
		
		Actions action=new Actions(driver);
		action.moveToElement(show).perform();
	
		driver.findElement(By.xpath("//*[@id=\"third\"]/div[2]/span[1]/a")).click();
		

	}

}
