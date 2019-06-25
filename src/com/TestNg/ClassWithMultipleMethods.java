package com.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassWithMultipleMethods {
	public static WebDriver driver;
@BeforeClass
	public static void setUp() {
		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// pass the url and Search test
		driver.get("https://www.google.com/");
	}
@Test(priority=0)
	public static void serchText() throws InterruptedException {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Worldcup");
		element.clear();
		element.sendKeys("worldcup2019");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
		// click on images link
		driver.findElement(By.linkText("Images")).click();
		// Click on all Link
		driver.findElement(By.linkText("All")).click();
	}
@Test(priority=1)
public static void readText() {
	// Read test from page using getText(); method
	String Res = driver.findElement(By.id("resultStats")).getText();
	System.out.println(Res);
}
@AfterClass
	public static void tearDown() {
		driver.quit();

	}
}