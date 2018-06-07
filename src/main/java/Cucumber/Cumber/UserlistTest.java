package Cucumber.Cumber;

import org.openqa.selenium.WebDriver;

import Pages.UserListPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserlistTest {
    WebDriver driver;
	BasePage page;
	
	@Given("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("After login checking");
	}
	
	
	@Then("^User is on userlist page$")
	public void user_is_on_userlist_page() throws Throwable {
		page=new BasePage();
		driver=page.getDriver();
		System.out.println("page.driver1=====>"+page.getDriver());
		UserListPage userlist=new UserListPage(driver);
		System.out.println("page.driver2=====>"+page.getDriver());
	    userlist.tableData();
		
	    System.out.println("==========>");
	}

	@Then("^get all row count$")
	public void get_all_row_count() throws Throwable {
	  System.out.println("get_all_row_count");
	}

	@Then("^page count$")
	public void page_count() throws Throwable {
	  System.out.println("page_count");
	}
	
}
