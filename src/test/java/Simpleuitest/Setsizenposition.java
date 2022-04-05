package Simpleuitest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setsizenposition {

	public static void main(String[] args) throws IOException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://twitter.com/?lang=en");
		int h=driver.manage().window().getSize().getHeight();
		int w=driver.manage().window().getSize().getWidth();
		System.out.println(h);
		System.out.println(w);
		Dimension s=driver.manage().window().getSize();
		System.out.println(s);
		driver.manage().window().setSize(new Dimension(500,200));
		int y=driver.manage().window().getPosition().getY();
		int x=driver.manage().window().getPosition().getX();
		System.out.println(y);
		System.out.println(x);
		Point p=driver.manage().window().getPosition();
		System.out.println(p);
		driver.manage().window().setPosition(new Point(200,300));
		//driver.manage().window().fullscreen();
		//File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcFile, new File("./image1.png"));
		WebElement element=driver.findElement(By.cssSelector("#user-name"));
		File srcFile1=element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile1, new File("./image2.png"));
				
	}

}
