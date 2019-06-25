package com.p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahoologinExplicitwait {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// Launch Application
		/*System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();*/
		//--Working with Ie-browser
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		driver = new InternetExplorerDriver();
			driver.get("https://login.yahoo.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
	
			// Login
			driver.findElement(By.id("login-username")).sendKeys("js_test@yahoo.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='signin']")).click();
			// Wait for Pwd
			
			WebDriverWait w = new WebDriverWait(driver, 10000);
			w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("password")));
			
			driver.findElement(By.name("password")).sendKeys("mqsankar");
			driver.findElement(By.name("verifyPassword")).click();
			/*Thread.sleep(2000);
			String Res=driver.findElement(By.className("error-msg")).getText();
			System.out.println(Res);*/
	
		}
	}