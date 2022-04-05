package basicsl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxl {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.navigate().to("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		WebElement selectjava=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
		selectjava.click();
		
		
		WebElement conformselect=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		boolean c=conformselect.isSelected();
		System.out.println(c);

		WebElement Firstelement=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		
		if(Firstelement.isSelected())
		{
			Firstelement.click();
		}
		
		WebElement Secondelement=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		
		if(Secondelement.isSelected()) {
			Secondelement.click();
		}
			
		WebElement select2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input"));
		select2.click();
		
		
		
	}

}
