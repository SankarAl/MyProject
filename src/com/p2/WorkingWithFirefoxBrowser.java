package com.p2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithFirefoxBrowser {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.hdfcbank.com/");

	}

}
