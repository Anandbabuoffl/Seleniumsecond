package basicsl;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authenticationpopupl {
	
	public static String username="admin";
	public static String password="admin";

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();  //http pop-ups
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
	}

}
