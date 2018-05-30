package Cucumber.Cumber;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	public WebDriver driver;


	@Before
	public void login(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SatishTvisha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		driver.get("http://192.168.2.60/true_connect_web/public/");	
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
       System.out.println("navigated");
	}
	
	@And("^User enters Credentials to LogIn$")
	public void user_enters_testuser_and_Test(DataTable usercredentials) throws Throwable {
 
		LoginPage loginPage=new LoginPage(driver);
		loginPage.user_enters_testuser_and_Test(usercredentials);
		
         }

	
	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	
	}
	
	
	
  }
