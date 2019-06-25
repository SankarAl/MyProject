package com.p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	// create the object
	public static WebDriver driver;

	public static void main(String[] args) {
		//Open the chrome browser
		System.setProperty("webriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Pass the Url
		driver.get("http://newtours.demoaut.com/");
		
		try {		
			driver.findElement(By.name("userName")).sendKeys("qaq");		
			driver.findElement(By.name("password")).sendKeys("qaq");
			driver.findElement(By.name("login")).click();
			WebDriverWait wait =new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(""))));
		
		} catch (Exception e) {
			System.out.println("unable to login");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
