package com.TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CommonFunction {
	public static WebDriver driver;

@BeforeClass
public void setUp() throws InterruptedException {
	// Open the Chrome Browser
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demo.actitime.com/login.do");
	Thread.sleep(3000);

}
@AfterClass
public void tearDown() {
	driver.close();
}}