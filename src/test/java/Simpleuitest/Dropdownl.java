package Simpleuitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownl {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.navigate().to("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		 WebElement dropdown1=driver.findElement(By.id("dropdown1"));
		 Select s1=new Select(dropdown1);
		 s1.selectByIndex(4);
		 s1.selectByValue("3");
		 s1.selectByVisibleText("Selenium");
		
		 
		List <WebElement> listofoptions= s1.getOptions();
		int size=listofoptions.size();
		System.out.println(size);
		
		dropdown1.sendKeys("A");
		
		
		WebElement multiselect=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select s2=new Select(multiselect);
		s2.selectByIndex(1);
		s2.selectByIndex(2);
		s2.selectByIndex(4);
		
		
		
		
		
	}

}
