package stepsDefination;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import Pageobjects.AddcustomerPage;
import Pageobjects.LoginPage;

public class BaseClass extends LoginPage{
	
	public WebDriver driver;
	
	public AddcustomerPage ap;
	
	
	//creating for generating random string for unique email
	public static String randomeString(){
		{
			String generatedstring1 = RandomStringUtils.randomAlphabetic(5);
			return(generatedstring1);
		}
	}

}
