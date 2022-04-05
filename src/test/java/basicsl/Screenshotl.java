package basicsl;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshotl {

	public static void main(String[] args) throws IOException {
		
		//Date currentd=new Date();
		//String screenshotfilename=currentd.toString().replace(" ", "-").replace(":", "-");
		//System.out.println(screenshotfilename);
			
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.leafground.com/");
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//FileHandler.copy(screenshotFile, new File(".//screenshot1.png"));
		FileHandler.copy(screenshotFile, new File("C:/Users/bbuanan/Videos/screenshot1.png"));
	}

}
