package com.p2;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exhandle {
	public static WebDriver driver;
public static void main(String[] args) throws Exception 
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://login.yahoo.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("username")).sendKeys("sankarmq");
	Thread.sleep(8000);
	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	WebDriverWait w = new WebDriverWait(driver, 5000);				
	
	w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("password")));  
	driver.findElement(By.name("password")).sendKeys("mqsankar");
	driver.findElement(By.name("verifyPassword")).click();
	
	Thread.sleep(5000);	
	
	try
	{

		if(driver.findElement(By.id("yucs-signout")).isDisplayed())
		{
			System.out.println("Login is success");
			
			driver.findElement(By.id("yucs-signout")).click();
		}
	}
	catch(Exception e)
	
	{
		System.out.println(e.getMessage());
		String str=driver.findElement(By.className("error-msg")).getText();
		System.out.println("Login is failed "+str);

		//take screenshot of the page
		File f=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		//copy the file srcfile to destfile
		FileUtils.copyFile(f,new File("d:/yahoo.jpg"));			
	}
}
}