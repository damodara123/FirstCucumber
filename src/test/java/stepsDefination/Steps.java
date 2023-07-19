package stepsDefination;

import static org.testng.Assert.expectThrows;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pageobjects.AddcustomerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps extends BaseClass{

	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() throws Exception {
		driver=lunchUrl();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	    Setusername(driver, email);
	    Setpassword(driver, password);
	}

	@When("Click on Login")
	public void click_on_login() {
	    Clicklogin(driver);
	}

	
	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}
	 

	@When("User Click on Log out link")
	public void user_click_on_log_out_link() throws Exception {
		Clicklogout(driver);
		Thread.sleep(3000);
	    
	}

	@Then("Close browser")
	public void close_browser() throws Exception {
	
			driver.quit();	   
	}


	
	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
		ap = new AddcustomerPage();
		Assert.assertEquals("Dashboard / nopCommerce administration", ap.getPageTitle(driver));
	    
	}

	@When("User Click on customers Menu")
	public void user_click_on_customers_menu() throws Exception {
		Thread.sleep(2000);
		ap.clickOnCustomersMenu(driver);
	   
	}

	@When("Clicks on customers menu Item")
	public void clicks_on_customers_menu_item() throws Exception {
		Thread.sleep(2000);
		ap.clickOnCustomersMenuItem(driver);
	   
	}

	@When("Click on Add new button")
	public void click_on_add_new_button() throws Exception {
		ap.clickOnAddNew(driver);
		Thread.sleep(2000);
	    
	}

	@Then("User can view Add new customers page")
	public void user_can_view_add_new_customers_page() {
	    Assert.assertEquals("Add a new customer / nopCommerce administration",ap.getPageTitle(driver));
	}

	@When("User enter customer info")
	public void user_enter_customer_info() throws Exception {
		String email = randomeString()+"@gmail.com";
		ap.setEmail(driver,email);
		ap.setPword(driver,"test@123");
		//registered - default
		//the register cannot be in both 'Guests' and 'Registered' customer roles
		//Add the customer to 'Guests' and 'Registered' customer role
		ap.setCustomerRoles(driver, "Guest");
		Thread.sleep(3000);
		
		ap.setMangerOfVendor(driver,"Vendor 2");
		ap.setGender(driver,"Male");
		ap.setFname(driver,"Damodara");
		ap.setLname(driver,"Palacharla");
		ap.setDob(driver, "07/19/1993");
		ap.setCompanyName(driver,"RamanaSoft");
		ap.setAdminContent(driver,"This is for BDD testing...");
		
	    
	}

	@When("Click on Save button")
	public void click_on_save_button() throws Exception {
	    ap.clickOnSave(driver);
	    Thread.sleep(2000);
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String msg) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully."));
	    
	}

	
}
