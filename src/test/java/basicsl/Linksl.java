package basicsl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linksl {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
	
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement home=driver.findElement(By.linkText("Go to Home Page"));
		home.click();
		
		driver.navigate().back();
		
		WebElement wheretogo=driver.findElement(By.partialLinkText(" without clicking me?"));
		String whereis=wheretogo.getAttribute("href");
		System.out.println(whereis);
		
		WebElement islinkbroken=driver.findElement(By.linkText("Verify am I broken?"));
		islinkbroken.click();
		String name=driver.getTitle();
		System.out.println(name);
		
		driver.navigate().back();
		
		WebElement home1=driver.findElement(By.linkText("Go to Home Page"));
		home1.click();
		
		driver.navigate().back();
		
		List <WebElement> alllinks=driver.findElements(By.tagName("a"));
	    int linkssize=	alllinks.size();
		System.out.println(linkssize);
		
		
	for (WebElement printlink : alllinks) {
		
		String link=printlink.getAttribute("href");
		String linktext=printlink.getText();
		System.out.println(link);
		System.out.println(linktext);
	}

	}

}
