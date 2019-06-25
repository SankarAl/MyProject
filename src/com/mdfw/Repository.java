package com.mdfw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repository {
	public static WebDriver driver;

	public static void setUp() {
		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(TestData.url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void login() {
		driver.findElement(Locators.userName_L).sendKeys(TestData.user_Name);
		driver.findElement(Locators.Password_L).sendKeys(TestData.user_password);
		driver.findElement(Locators.login_L).click();
	}
}
