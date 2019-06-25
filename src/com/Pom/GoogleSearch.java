package com.Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class GoogleSearch {
	public WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	public void txtToSearch(WebDriver driver) {
		GooglePageObjects.txtSearchGoogle(driver).sendKeys("selenium");
		GooglePageObjects.btnGoogleSearch(driver).click();
}}







