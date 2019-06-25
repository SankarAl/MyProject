package com.TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Validations extends CommonFunction{

	@Test
	public void loginTest() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement objUserName = driver.findElement(By.name("username"));

		if (objUserName.isDisplayed()) {
			System.out.println("Username element found in Application and Script executing ....");

			if (objUserName.isEnabled()) {
				System.out.println("Username element is enable for typing");
				objUserName.sendKeys("user");

				driver.findElement(By.name("pwd")).sendKeys("user");

				driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();

			} else {
				System.out.println("Username element is disable for typing");
			}
		}

		else {
			System.out.println("Username element not found in Application");
		}
	}

}