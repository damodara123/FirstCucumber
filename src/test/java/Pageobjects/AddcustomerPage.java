package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.Genericmethods.Genericfunctionalities;

public class AddcustomerPage extends Genericfunctionalities{

	
	public By lnkCustomers_menu = By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	public By lnkCustomers_menuitem = By.xpath("//i[@class='nav-icon far fa-dot-circle']//following-sibling::p[text()=' Customers']");
	
	public By btnAddnew = By.xpath("//a[@class='btn btn-primary']");
	
	public By txtEmail = By.xpath("//input[@type='email']");
	public By txtPword = By.xpath("//input[@type='password']");
	
	public By txtcustomersRolles = By.xpath("//div[@class='input-group-append input-group-required']//div[@class='k-multiselect-wrap k-floatwrap']");
	
	public By listitemadministrators = By.xpath("//option[text()='Administrators']");
	public By listitemforummd = By.xpath("//option[text()='Forum Moderators']");
	public By listitemguest = By.xpath("//option[text()='Guests']");
	public By listitemregistered = By.xpath("//option[text()='Registered']");
	public By listitemvendors = By.xpath("//option[text()='Vendors']");
	
	public By dropmgvendorid = By.xpath("//select[@id='VendorId']");
	public By rdMalegender = By.xpath("//input[@id='Gender_Male']");
	public By rdFemalegender = By.xpath("//input[@id='Gender_Female']");
	
	public By txtFname = By.xpath("//input[@id='FirstName']");
	public By txtLname = By.xpath("//input[@id='LastName']");
	
	public By txtDob = By.xpath("//input[@id='DateOfBirth']");
	public By txtCompanyname = By.xpath("//input[@id='Company']");
	
	public By txtAdmincontent = By.xpath("//textarea[@id='AdminComment']");
	
	public By btnSave = By.xpath("//button[@name='save']");
	
	
	
	//Action Methods
	
	public String getPageTitle(WebDriver driver)
	{
		return driver.getTitle();
		
	}
	
	public void clickOnCustomersMenu(WebDriver driver)
	{
		Click(driver, lnkCustomers_menu);
	}
	
	public void clickOnCustomersMenuItem(WebDriver driver)
	{
		Click(driver, lnkCustomers_menuitem);
	}
	
	public void clickOnAddNew(WebDriver driver)
	{
		Click(driver, btnAddnew);
	}
	
	public void setEmail(WebDriver driver, String Ename)
	{
		SendKeys(driver, txtEmail, Ename);
	}
	
	public void setPword(WebDriver driver, String Epass)
	{
		SendKeys(driver, txtPword, Epass);
	}
	
	public void setCustomerRoles(WebDriver driver, String Role) throws Exception
	{
		Click(driver, txtcustomersRolles);
		
		WebElement listitem;
		Thread.sleep(3000);
		
		if(Role.equalsIgnoreCase("Administrators"))
		{
			listitem = driver.findElement(listitemadministrators);
		}
		
		else if (Role.equalsIgnoreCase("Guests"))
		{
			listitem = driver.findElement(listitemguest);
		}
		
		else if (Role.equalsIgnoreCase("Registered"))
		{
			listitem = driver.findElement(listitemregistered);
		}
		
		else if (Role.equalsIgnoreCase("Vendors"))
		{
			listitem = driver.findElement(listitemvendors);
		}
		else
		{
			listitem = driver.findElement(listitemforummd);
		}
		
		//listitem.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",listitem);
	}
	
	public void setMangerOfVendor(WebDriver driver, String value)
	{
		Select_by_Text(driver, dropmgvendorid, value);
	}
	
	public void setGender(WebDriver driver, String gender)
	{
		if(gender.equalsIgnoreCase("Male"))
		{
			Click(driver, rdMalegender);
		}
		else if(gender.equalsIgnoreCase("Female"))
		{
			Click(driver, rdFemalegender);
		}
		else
		{
			Click(driver, rdMalegender);//default selcted 
		}
	}
	
	public void setFname(WebDriver driver, String fname)
	{
		SendKeys(driver,txtFname, fname);
	}
	
	public void setLname(WebDriver driver, String lname)
	{
		SendKeys(driver,txtLname, lname);
	}
	
	public void setDob(WebDriver driver, String dob)
	{
		SendKeys(driver,txtDob, dob);
	}
	
	public void setCompanyName(WebDriver driver, String cname)
	{
		SendKeys(driver,txtCompanyname, cname);
	}
	
	public void setAdminContent(WebDriver driver, String content)
	{
		SendKeys(driver,txtAdmincontent, content);
	}
	
	public void clickOnSave(WebDriver driver)
	{
		Click(driver, btnSave);
	}
	
}
