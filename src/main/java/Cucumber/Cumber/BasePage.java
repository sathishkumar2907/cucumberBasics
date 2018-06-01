package Cucumber.Cumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public static WebDriver driver;

	public static void login(){
		System.setProperty("webdriver.chrome.driver", "D:\\Springworkspace\\Cumber\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	
	
	
}
