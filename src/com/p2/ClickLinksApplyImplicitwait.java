package com.p2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinksApplyImplicitwait {
	// create the object
	public static WebDriver driver;

	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	public void clicklinks(String nLanguage,String ILanguage) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText(nLanguage)).click();
		driver.findElement(By.linkText(ILanguage)).click();
		/*driver.findElement(By.linkText("हिन्दी")).click();
		driver.findElement(By.linkText("हिन्दी")).click();
		driver.findElement(By.linkText("తెలుగు")).click();
		driver.findElement(By.linkText("English")).click();*/
	}

	public static void teardown() {
		driver.quit();
	}

	public static void main(String[] args) {
		ClickLinksApplyImplicitwait obj = new ClickLinksApplyImplicitwait();
		setUp();
		obj.clicklinks("हिन्दी", "English");
		obj.clicklinks("తెలుగు", "English");
		teardown();

	}

}
