package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class utilityClass {

	
	public WebDriver driver;
	public Properties property;
	

	public WebDriver browserDetails() throws IOException
	{
		property=new Properties();
		FileInputStream InputFile=new FileInputStream("C:\\Users\\Udit\\Desktop\\Task\\webApplication\\src\\main\\java\\utility\\Input.Properties");
		property.load(InputFile);
		String Browser=property.getProperty("BrowserName");
		if(Browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.IE.driver","IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}
	
	/*
	public void tearDown()
	{
		driver.quit();
	}
	*/
}
