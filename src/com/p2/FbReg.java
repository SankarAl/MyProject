package com.p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbReg {
	//Create the object
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//Open the Browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		//pass the url
		driver.get("https://www.facebook.com/");
		//maximize the browser
		driver.manage().window().maximize();
		//Register
		driver.findElement(By.id("u_0_j")).sendKeys("Srinivas");
		driver.findElement(By.name("lastname")).sendKeys("Sankar");
		driver.findElement(By.id("u_0_o")).sendKeys("Srinivassankar5@gmail.com");
		//Re-enter email
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Srinivassankar5@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@5");
		//Select the value from DropDown
		Select Bday = new Select(driver.findElement(By.name("birthday_day")));
		Bday.selectByIndex(5);
		Select Bmonth = new Select(driver.findElement(By.id("month")));
		Bmonth.selectByVisibleText("Oct");
		Select Byear = new Select(driver.findElement(By.name("birthday_year")));
		Byear.selectByValue("2012");
		//wait
		Thread.sleep(2000);
		//Click on Radio Buttons
		driver.findElement(By.id("u_0_7")).click();
		//Click on Submit button
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		
		

	}

}
