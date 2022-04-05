package basicsl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobuttonl {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.navigate().to("http://www.leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		
	WebElement R1=	driver.findElement(By.id("yes"));
	boolean s1=R1.isSelected();
	WebElement R2=	driver.findElement(By.id("no"));
	boolean s2=R2.isSelected();
	System.out.println(s1);
	System.out.println(s2);
	R1.click();
	
	WebElement RR1=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
	boolean ss1=RR1.isSelected();
	WebElement RR2=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
	boolean ss2=RR2.isSelected();
	System.out.println(ss1);
	System.out.println(ss2);
	RR1.click();
		
	WebElement RRR1=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]"));
	boolean sss1=RRR1.isSelected();
	WebElement RRR2=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]"));
	boolean sss2=RRR2.isSelected();
	WebElement RRR3=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]"));
	boolean sss3=RRR3.isSelected();
	System.out.println(sss1);
	System.out.println(sss2);
	System.out.println(sss3);
	RRR1.click();
		
	
	}

}
