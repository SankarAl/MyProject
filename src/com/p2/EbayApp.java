package com.p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayApp {
	public static WebDriver driver;

	public static void setUp() {
		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// pass the url and Search test
		driver.get("https://in.ebay.com/");
	}
	public  void serchText() throws InterruptedException {
		WebElement element = driver.findElement(By.id("gh-ac"));
		element.sendKeys("Tv");
		element.clear();
		element.sendKeys("Toys");
		Thread.sleep(3000);
		driver.findElement(By.id("gh-btn")).click();
	}
	public static void tearDown(){
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		EbayApp obj = new EbayApp();
		setUp();
		obj.serchText();
		tearDown();

	}

}
