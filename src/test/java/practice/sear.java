package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sear {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/cart");
		driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Search")).click();

	}

}
