package basicsl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SLLerrorl {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//global profile
		DesiredCapabilities dc=new DesiredCapabilities();
		//dc.setAcceptInsecureCerts(true);
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions coption=new ChromeOptions();
		coption.merge(dc);
		
		WebDriver driver=new ChromeDriver(coption);
		driver.get("https://expired.badssl.com/");
		
	}

}
