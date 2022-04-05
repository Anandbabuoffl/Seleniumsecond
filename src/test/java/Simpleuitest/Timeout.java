package Simpleuitest;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Timeout {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String s=driver.getWindowHandle();
		driver.navigate().to("https://twitter.com/?lang=en");
		driver.manage().window().maximize();
	Thread.sleep(200);
		driver.navigate().back();
		Thread.sleep(200);
		driver.navigate().refresh();
		Thread.sleep(200);
		driver.navigate().forward();
		Thread.sleep(200);
		driver.switchTo().newWindow(WindowType.WINDOW);
		//String s=driver.getWindowHandle();
		driver.switchTo().window(s);
		driver.switchTo().newWindow(WindowType.TAB);
		Dimension size=driver.manage().window().getSize();
		System.out.println(size);
		int h=driver.manage().window().getSize().getHeight();
		System.out.println(h);
		driver.manage().window().setSize(new Dimension(500,600));
		
		driver.close();
		//driver.quit();
	}

}
