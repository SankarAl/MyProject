package com.TestNg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutoIt {
	public static WebDriver driver;
@BeforeClass
	public static void setUp() {
		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// pass the url and Search test
		driver.get("https://www.timesjobs.com/candidate/register.html?pageFlow=TJ_HOME");
	}
@Test
	public static void browsefile() throws InterruptedException, IOException {
		driver.findElement(By.id("emailAdd")).sendKeys("SrinivasSankar5@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("resumeFile_basic")).click();
		//driver.findElement(By.name("resumeFile_basic")).sendKeys("E:\\2Process_of_Developing_Project_in_the_Software_Company-Sdlc.doc");
		Thread.sleep(2000);
		Runtime.getRuntime().exec("E://Choosefile.exe");
		driver.findElement(By.xpath("//input[@id='productUpload']")).sendKeys("C:\\Mobile App Automation with Appium.docx");
	}

@AfterClass
	public static void tearDown() {
		//driver.quit();

	}
}