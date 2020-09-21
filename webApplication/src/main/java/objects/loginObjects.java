package objects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginObjects {

	public WebDriver driver;
	public Properties property;
	
	By Email=By.xpath("(//input[@name='email'])[1]");
	By Password=By.xpath("(//input[@name='password'])[1]");
	By Frame=By.cssSelector("iframe[name^=a]");
	By Captcha=By.cssSelector("div.recaptcha-checkbox-border");
	By SubmitButton=By.xpath("//button[@id='loginBtn']");
	
	public loginObjects(WebDriver driver)
	{
			this.driver=driver;
	}
	
	public WebElement L_Email()
	{
		return driver.findElement(Email);
	}
	
	public WebElement L_Password()
	{
		return driver.findElement(Password);
	}

	public WebElement L_Frame()
	{
		return driver.findElement(Frame); 
	}
	
	public WebElement L_Captcha()
	{
		return driver.findElement(Captcha); 
	}
	
	
	public WebElement L_SubmitButton()
	{
		return driver.findElement(SubmitButton);
	}
	
	
}
