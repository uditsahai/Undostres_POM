package testCode;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import objects.homepageObjects;
import objects.loginObjects;
import objects.paymentObjects;
import utility.utilityClass;

public class launchTest extends utilityClass {
	
	public WebDriver driver;
	public Properties property;
	
	@Test
	public void landingPage() throws IOException
	{
		driver=browserDetails();
		driver.get("http://undostres.com.mx/");
		
		homepageObjects hp=new homepageObjects(driver);
		hp.H_operator().click();
		hp.H_operatorName().click();
		hp.H_mobileNo().clear();
		hp.H_mobileNo().sendKeys("5523261151");
		hp.H_rechargeOption().click();
		hp.H_rechargeAmount().click();
		hp.H_submitButton().click();	
		
	}

	@Test(dependsOnMethods = "landingPage")
	public void cardPage()
	{
		paymentObjects PJ=new paymentObjects(driver);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		PJ.C_Card().click();
		PJ.C_CardName().clear();
		PJ.C_CardName().sendKeys("Test");
		PJ.C_CardNumber().clear();
		PJ.C_CardNumber().sendKeys("4111111111111111");
		PJ.C_Month().clear();
		PJ.C_Month().sendKeys("11");
		PJ.C_Year().clear();
		PJ.C_Year().sendKeys("2025");
		PJ.C_CVV().clear();
		PJ.C_CVV().sendKeys("111");
		PJ.C_Email().clear();
		PJ.C_Email().sendKeys("test@test.com");
		PJ.C_SubmitButton().click();	
	}
	
	
	@Test(dependsOnMethods = "cardPage")
	public void Login() throws InterruptedException
	{
		loginObjects lo=new loginObjects(driver);
		Thread.sleep(20000);
		lo.L_Email().clear();
		lo.L_Email().sendKeys("automationexcersise@test.com");
		Thread.sleep(20000);
		lo.L_Password().clear();
		lo.L_Password().sendKeys("123456");
		Thread.sleep(20000);
		driver.switchTo().frame(lo.L_Frame());
		lo.L_Captcha().click();
		driver.switchTo().parentFrame();
		lo.L_SubmitButton().click();
		
	}
	 
	
	
	
}

