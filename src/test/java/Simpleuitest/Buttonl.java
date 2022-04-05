package Simpleuitest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttonl {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.navigate().to("http://www.leafground.com/pages/Button.html");
		
		WebElement position=driver.findElement(By.id("position"));
		Point xy=position.getLocation();
		int x=xy.getX();
		int y=xy.getY();
		System.out.println(x);
		System.out.println(y);
		
		WebElement color=driver.findElement(By.id("color"));
		String c=color.getCssValue("background-color");
		System.out.println(c);
		
		WebElement size=driver.findElement(By.id("size"));
		Dimension hw=size.getSize();
		int h=hw.getHeight();
		int w=hw.getWidth();
		System.out.println(h);
		System.out.println(w);
		
		WebElement home=driver.findElement(By.id("home"));
		home.click();
		
	}

}
