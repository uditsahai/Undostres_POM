package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepageObjects {
	
	public WebDriver driver;
	
	By Operator=By.xpath("//input[@name='operator'][@suggest='mobile-operator']");
	By OperatorName=By.linkText("Telcel");
	By MobileNo=By.xpath("//input[@name='mobile'][@oninput='checkMob(this)']");
	By RechargeOption=By.xpath("//input[@name='amount'][@suggest='mobile-operator_amount']");
	By RechargeAmount=By.xpath("//li[@data-show='$10 (Recarga Saldo)']");
	By SubmitButton=By.xpath("(//button[@class='button buttonRecharge'])[1]");
	//By SubmitButton=By.cssSelector("button.button.buttonRecharge");
	
	public homepageObjects(WebDriver driver)
	{
			this.driver=driver;
	}
	
	public WebElement H_operator()
	{
		return driver.findElement(Operator);
	}
	
	public WebElement H_operatorName()
	{
		return driver.findElement(OperatorName);
	}

	public WebElement H_mobileNo()
	{
		return driver.findElement(MobileNo);
	}
	
	public WebElement H_rechargeOption()
	{
		return driver.findElement(RechargeOption);
	}
	
	public WebElement H_rechargeAmount()
	{
		return driver.findElement(RechargeAmount);
	}
	
	public WebElement H_submitButton()
	{
		return driver.findElement(SubmitButton);
	}
		
}
