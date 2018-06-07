package Cucumber.Cumber;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.listener.Reporter;

import Pages.LoginPage;
import Pages.UserListPage;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;

public class Test_Steps{
	WebDriver driver;
	BasePage page;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		 page=new BasePage();
		 page.getProperties();
		 page.SetUpBrowser();
		 driver=page.getDriver();
		 driver.get("http://192.168.2.60/true_connect_web/public/");
	  
		 /* ChromeDriver chrome=ChromeDriver.class.newInstance();
		  System.out.println("chrome----> "+chrome);*/
		 
		//BasePage.login();//by static fubnctionality
		//BasePage.driver.get("http://192.168.2.60/true_connect_web/public/");	
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable { 		
       System.out.println("navigated");
       Reporter.addStepLog("navigated to Login page");
	}
	
	@And("^User enters Credentials to LogIn$")
	public void user_enters_testuser_and_Test(DataTable usercredentials) throws Throwable {
 
		LoginPage loginPage=new LoginPage(driver);
		loginPage.user_enters_testuser_and_Test(usercredentials);
		
	}

	
	
	
  }
