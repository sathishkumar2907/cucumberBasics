package Pages;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Cucumber.Cumber.BasePage;
import cucumber.api.DataTable;

public class LoginPage{
WebDriver driver;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="dXNlcm5hbWU")
	private WebElement username;
	
	@FindBy(id="cGFzc3dvcmQ")
	private WebElement password;
	
	@FindBy(id="bG9naW5CdG4")
	private WebElement loginbtn;
	
	@FindBy(xpath="//*[@id='navbardrop']/div/span")
	private WebElement loginOutdrpdown;
	
	
	@FindBy(xpath="//*[@id='myNavbar']/ul/li/div/a[2]")
	private WebElement loginOutbtn;
	
	@FindBy(id="feedbackSection")
	private WebElement loginerrorMsg;
	
	
public void user_enters_testuser_and_Test(DataTable usercredentials) throws Throwable {
 
		for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) {
			System.out.println("data==> "+data);
			System.out.println("RunMode===> "+data.get("RunMode"));
			
			if(data.get("RunMode").equals("Yes")){
		
				username.clear();
				username.sendKeys(data.get("Username"));
				
				password.clear();
				password.sendKeys(data.get("Password"));
				
				loginbtn.click();
				
				String test=loginerrorMsg.getText();
				if(test.equals("Invalid Credentials")){
					System.out.println("Invalid Credentials");
				}else{
					System.out.println("Valid Credentials");
				}
			
				logoutbtn();
			}
		  }
        }

   public void logoutbtn() throws InterruptedException{
	  
	  /* System.out.println("dropdoen");
		loginOutdrpdown.click();
	    Thread.sleep(500);
	    loginOutbtn.click();
      */  
	   
   }
   
   
   


}
