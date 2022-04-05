package basicsl;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Downloadfilesl {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
	WebElement Excelfile=	driver.findElement(By.linkText("Download Excel"));
	Excelfile.click();
	Thread.sleep(2000);
	
	WebElement Pdffile=	driver.findElement(By.linkText("Download PDF"));
	Pdffile.click();
	Thread.sleep(2000);
	
	//WebElement Textfile=	driver.findElement(By.linkText("Download Text"));
	//Textfile.click();
	//Thread.sleep(2000);
	
	File filedownload=new File("Downloads");
	File[] totalfiles=filedownload.listFiles();
	
	for(File downloadfiles3:totalfiles) {
		if(downloadfiles3.getName().equals(Excelfile)) {
			System.out.println("true");
		}
	}
	

	}

}
