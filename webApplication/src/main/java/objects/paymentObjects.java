package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class paymentObjects {

public WebDriver driver;
	
	By Card=By.cssSelector("a[class*='select-card']");
	By CardName=By.xpath("(//input[@name='cardname'])[2]");
	By CardNumber=By.cssSelector("*[id='cardnumberunique']");
	By Month=By.xpath("(//input[@name='expmonth'])[2]");
	By Year=By.xpath("(//input[@name='expyear'])[2]");
	By CVV=By.xpath("(//input[@name='cvvno'])[2]");
	By Email=By.xpath("//input[@class='form-control email']");
	By SubmitButton=By.xpath("//button[@name='formsubmit']");
	
	public paymentObjects(WebDriver driver)
	{
			this.driver=driver;
	}
	
	public WebElement C_Card()
	{
		return driver.findElement(Card);
	}
	
	public WebElement C_CardName()
	{
		return driver.findElement(CardName);
	}

	public WebElement C_CardNumber()
	{
		return driver.findElement(CardNumber); 
	}
	
	public WebElement C_Month()
	{
		return driver.findElement(Month);
	}
	
	public WebElement C_Year()
	{
		return driver.findElement(Year);
	}
	
	public WebElement C_CVV()
	{
		return driver.findElement(CVV);
	}
	
	public WebElement C_Email()
	{
		return driver.findElement(Email);
	}
	
	public WebElement C_SubmitButton()
	{
		return driver.findElement(SubmitButton);
	}
	
	
	
}
