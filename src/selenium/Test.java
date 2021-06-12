package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test {
	public static void main(String[] args) {
		//to configure the drivers
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sudhakar\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		//to launch application
		driver.get("https://www.facebook.com/");
	}
	
	
	
	
	

}
