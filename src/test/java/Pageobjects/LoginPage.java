package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Genericmethods.Genericfunctionalities;

public class LoginPage extends Genericfunctionalities {
	
	public By Username = By.id("Email");
	public By Password = By.id("Password");
	public By Loginbtn = By.xpath("//button[@type='submit']");
	
	public By Logoutlink = By.xpath("//a[text()='Logout']");
	
	
	
	public void Setusername(WebDriver driver, String uname) 
	{
		Clear(driver, Username);
		SendKeys(driver, Username, uname);
	}
	
	public void Setpassword(WebDriver driver, String pword)
	{
		Clear(driver, Password);
		SendKeys(driver, Password, pword);
	}
	
	public void Clicklogin(WebDriver driver)
	{
		Click(driver, Loginbtn);
	}
	
	public void Clicklogout(WebDriver driver)
	{
		Click(driver, Logoutlink);
	}

}
