package Cucumber.Cumber;

import Pages.UserListPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserlistTest {

	@Given("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("After login checking");
	}
	
	
	@Then("^User is on userlist page$")
	public void user_is_on_userlist_page() throws Throwable {
	    UserListPage userlist=new UserListPage(BasePage.driver);
		UserListPage.tableData();
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
