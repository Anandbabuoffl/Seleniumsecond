package Simpleuitest;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Printalllinks {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.jiosaavn.com/");
		List <WebElement> a=driver.findElements(By.tagName("a"));
		System.out.println(a.size());
		
		for(int i=0;i<a.size();i++) {
			WebElement elements=a.get(i);
			String url=elements.getAttribute("href");
			System.out.println(url);
			URL link=new URL(url);
			HttpURLConnection htc=(HttpURLConnection)link.openConnection();
			htc.setConnectTimeout(2000);
			htc.connect();
			if(htc.getResponseCode()>=400) {
				System.out.println(url+"-"+"is broken");
			}else {
				System.out.println(url+"-"+"is valid");
			}
		}
		
		
		/*
		 * for(int i=0;i<a.size();i++) {
		 * System.out.println("Links on the page are "+a.get(i).getAttribute("href"));
		 * System.out.println("Links Text are "+a.get(i).getText()); }
		 */
	}

}
