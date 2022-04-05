package basicsl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocompletel {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement text=driver.findElement(By.id("tags"));
		text.sendKeys("s");
		Thread.sleep(2000);
		List <WebElement> textmatches=driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		System.out.println(textmatches.size());
		
		for (WebElement alltext : textmatches) {
			if(alltext.getText().equals("SOAP")) {
			alltext.click();
			System.out.println(alltext.getText());}
			else {
				System.out.println("no text");
			
			
			}
		}
	}

}
