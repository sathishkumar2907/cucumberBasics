package Pages;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;

public class LoginPage {
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
	
	
	
public void user_enters_testuser_and_Test(DataTable usercredentials) throws Throwable {
 
		for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) {
			
			username.clear();
			username.sendKeys(data.get("Username"));
		    
			password.clear();
			password.sendKeys(data.get("Password"));
			
			loginbtn.click();
			
		   }
         }


}
