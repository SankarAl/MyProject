package com.p2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassingParameters {
	// create the object
	public static WebDriver driver;

	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	public void clicklinks(String nLanguage, String ILanguage) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText(nLanguage)).click();
		driver.findElement(By.linkText(ILanguage)).click();
	}

	public static void teardown() {
		driver.quit();
	}

	public static void main(String[] args) {
		PassingParameters obj = new PassingParameters();
		setUp();
		obj.clicklinks("हिन्दी", "English");
		obj.clicklinks("తెలుగు", "English");
		teardown();

	}

}
