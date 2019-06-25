package com.TestNg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UsingJE {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		// Launch the Yahoo mail
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
	}

	@Test
	public static void browsefile() throws InterruptedException {
		// Login
		driver.findElement(By.name("username")).sendKeys("js_test@yahoo.com");
		driver.findElement(By.id("login-signin")).click();
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("selenium@5");
		driver.findElement(By.name("verifyPassword")).click();
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//*[@id='ybarAccountMenuBody']/a[3]/span")).click();

		// using JavascriptExecutor

		WebElement logout = driver.findElement(By.xpath("//*[@id='ybarAccountMenuBody']/a[3]/span"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", logout);
	}

	@AfterClass
	public static void tearDown() {
		// driver.quit();

	}
}