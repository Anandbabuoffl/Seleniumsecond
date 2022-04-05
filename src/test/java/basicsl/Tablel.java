package basicsl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tablel {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		List <WebElement> columnsize=driver.findElements(By.tagName("th"));
		int colsize=columnsize.size();
		System.out.println(colsize);
		
		List <WebElement> rowsize=driver.findElements(By.tagName("tr"));
		int rsize=rowsize.size();
		System.out.println(rsize);
		
		WebElement getpercent=
	    driver.findElement(By.xpath("//td[normalize-space()='Learn to interact using Keyboard, Actions']//following::td[1]"));
		
		String percent=getpercent.getText();
		System.out.println(percent);
		
		List <WebElement> getallprogress=driver.findElements(By.xpath("//td[2]"));
		
	     ArrayList<Integer> numberlist=new ArrayList();
	     
		for (WebElement progresstext: getallprogress) {
			String progess=progresstext.getText().replace("%", "");
			numberlist.add(Integer.parseInt(progess));	
			//System.out.println(numberlist);
		}
		System.out.println(numberlist);
		
		int smallvalueinprogress=Collections.min(numberlist);
		System.out.println(smallvalueinprogress);
		
		String smallstring=Integer.toString(smallvalueinprogress)+"%";
		
		String finalXpath="//td[normalize-space()="+"\""+smallvalueinprogress +"%"+"\""+"]"+"//following::td[3]";
		System.out.println(finalXpath);
		
		WebElement check=driver.findElement(By.xpath(finalXpath));
		check.click();
		//driver.quit();
		

	}

}
