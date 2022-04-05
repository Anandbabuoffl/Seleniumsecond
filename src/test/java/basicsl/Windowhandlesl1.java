package basicsl;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandlesl1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.navigate().to("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		
		String oldwindow=driver.getWindowHandle();
		Thread.sleep(2000);
		WebElement pressbutton1=driver.findElement(By.id("home"));
		pressbutton1.click();
		
		Set <String> handles=driver.getWindowHandles();
		

for (String newwindow : handles) {
	driver.switchTo().window(newwindow);
}

WebElement Editbox=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/h5"));
Editbox.click();

WebElement email=driver.findElement(By.id("email"));
email.sendKeys("Fill lines");
		
driver.switchTo().window(oldwindow);
driver.quit();
	}

}
